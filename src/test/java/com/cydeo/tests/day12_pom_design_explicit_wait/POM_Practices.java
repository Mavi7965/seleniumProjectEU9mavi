package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class POM_Practices {

    LibraryLoginPage libraryLoginPage; // variable of object

    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");

        libraryLoginPage= new LibraryLoginPage(); // re-instantiate POM
        //the object is capable for carrying driver's id and capable to access webElements which I've created in the page

    }


    @Test
    public void required_field_error_message_test(){

      //// Driver.getDriver().get("https://library1.cydeo.com/"); MOVED IT TO BEFORE METHOD
        //3- Do not enter any information

      //// libraryLoginPage= new LibraryLoginPage();   MOVED IT TO BEFORE METHOD

        //4-click to sign-in button
        libraryLoginPage.signInButton.click(); // we reach the element through the custom class(libraryLoginPage)

        //5-verify expected error is displayed
        //expected: This field is required.
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());

        Driver.closeDriver();

    }


    @Test
    public void invalid_email_format_error_message_test(){


        //3- enter invalid email format


        libraryLoginPage.inputUsername.sendKeys("somethingwrong");
        libraryLoginPage.signInButton.click();

        //4- verify expected error is displayed
        //expected: Please enter a valid email address.

        Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());

        Driver.closeDriver();

    }



    @Test
    public void library_negative_login_test(){
        //TC #3: Library negative login
        //1- Open a Chrome browser
        //2- Go to: https://library1.cydeo.com

        //3- Enter incorrect username or incorrect password

        libraryLoginPage.inputUsername.sendKeys("wrong@username.com");
        libraryLoginPage.inputPassword.sendKeys("wrongpassword");

        libraryLoginPage.signInButton.click();
        BrowserUtils.sleep(2);

        //4- Verify title expected error is displayed:
        //Expected: Sorry, Wrong Email or Password
        Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());
        Driver.closeDriver();

    }




}



