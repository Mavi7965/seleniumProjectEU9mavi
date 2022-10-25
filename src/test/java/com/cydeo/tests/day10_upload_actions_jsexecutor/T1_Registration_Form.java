package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void registration_form_test(){

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        //create java faker onject
        Faker faker=new Faker();

        // 3. Enter first name
        WebElement inputFirstName=Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        //inputFirstName.sendKeys(faker.name().firstName());
        String fakerFirstName= faker.name().firstName();
        inputFirstName.sendKeys(fakerFirstName);

        //4. Enter last name
        WebElement inputLastName=Driver.getDriver().findElement(By.xpath("//input[@name='lastname']"));
        inputLastName.sendKeys(faker.name().lastName());

        //5. Enter username
        WebElement inputUsername= Driver.getDriver().findElement(By.xpath("//input[@name='username']"));
       // inputUsername.sendKeys(faker.name().username().replace(".",""));
        String user=faker.bothify("helpdesk###");
        inputUsername.sendKeys(user);

        //6. Enter email address
        WebElement inputEmail= Driver.getDriver().findElement(By.xpath("//input[@name='email']"));
        inputEmail.sendKeys(user+ "@email.com");

        //7. Enter password
        WebElement inputPassword= Driver.getDriver().findElement(By.xpath("//input[@name='password']"));
        inputPassword.sendKeys(faker.numerify("########"));
        //faker.internet().password();

        //8. Enter phone number
        WebElement inputPhone= Driver.getDriver().findElement(By.xpath("//input[@name='phone']"));
        inputPhone.sendKeys(faker.numerify("###-###-####"));

        //9. Select a gender from radio buttons
        WebElement inputGender= Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        inputGender.click();

        //10.Enter date of birth
        WebElement inputBirthday= Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        inputBirthday.sendKeys("04/08/2000");

        //11.Select Department/Office
        Select departmentDropdown= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        departmentDropdown.selectByIndex(faker.number().numberBetween(1,9));


        Select jobTitle= new Select(Driver.getDriver().findElement(By.xpath("//select[@name='job_title']")));
        jobTitle.selectByIndex(faker.number().numberBetween(1,8));

        //13.Select programming language from checkboxes
        WebElement programmingLanguage= Driver.getDriver().findElement(By.id("inlineCheckbox1"));
        programmingLanguage.click();

        //14.Click to sign up button
        WebElement signUpButton=Driver.getDriver().findElement(By.id("wooden_spoon"));
        signUpButton.click();


        //15.Verify success message “You've successfully completed registration!” is
        //displayed.
        WebElement successMessage= Driver.getDriver().findElement(By.xpath("//div/p"));

        String actualMessage= successMessage.getText();
        String expectedMessage= "You've successfully completed registration!";

        Assert.assertEquals(actualMessage, expectedMessage);





    }






}
