package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.pages.DynamicControlsPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.NoSuchElementException;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitPractices {

    DynamicControlsPage dynamicControlsPage;

    @BeforeMethod
    public void setupMethod(){

        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");
        dynamicControlsPage = new DynamicControlsPage();

    }

    @Test (priority = 1)
    public void remove_button_test(){
        //3- Click to “Remove” button
        dynamicControlsPage.removeButton.click();

        //4- Wait until “loading bar disappears”

       // Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);
        //WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        //wait.until(ExpectedConditions.invisibilityOf(dynamicControlsPage.loadingBar));

        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);

        //5- Verify:
        //a. Checkbox is not displayed

        try {
            Driver.getDriver().manage().timeouts().implicitlyWait(0, TimeUnit.SECONDS);

           // Assert.assertTrue(!dynamicControlsPage.checkbox.isDisplayed());
            Assert.assertFalse(dynamicControlsPage.checkbox.isDisplayed());
        }catch (NoSuchElementException n){
            Assert.assertTrue(true);
        }

        //b. “It’s gone!” message is displayed.
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's gone!"));
    }


    @Test(priority = 2)
    public void enableButtonTest(){
        Driver.getDriver().manage().timeouts().implicitlyWait(8,TimeUnit.SECONDS);
        //click to "enable" button
        dynamicControlsPage.enableButton.click();

        //wait until loading bar disappears
        BrowserUtils.waitForInvisibilityOf(dynamicControlsPage.loadingBar);


        // ONLY THIS LINE RETURNS  "TRUE"
        System.out.println("dynamicControlsPage.inputBox.isEnabled() = " + dynamicControlsPage.inputBox.isEnabled());

        //verify :
        //a. input box is enabled.
        Assert.assertTrue(dynamicControlsPage.inputBox.isEnabled());

        //b."It's enabled!" message is displayed
        Assert.assertTrue(dynamicControlsPage.message.isDisplayed());

        // Check the String value is matching as expected: "It's enabled!"
        Assert.assertTrue(dynamicControlsPage.message.getText().equals("It's enabled!"));

    }


    // seni seviyorum Amooosss  :)


}
