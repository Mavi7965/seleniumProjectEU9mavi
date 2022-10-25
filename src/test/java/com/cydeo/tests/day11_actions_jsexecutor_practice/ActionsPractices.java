package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionsPractices {

    @Test
    public void task_4_and_5_test() {
        // Scroll practice
        //go to https://practice.cydeo.com/

        Driver.getDriver().get("https://practice.cydeo.com/");
        //create object of Actions and pass our "driver" instance
        Actions actions = new Actions(Driver.getDriver());

        //locating CYDEO link to be able to pass in the actions method
        WebElement cydeoLink = Driver.getDriver().findElement(By.linkText("CYDEO"));
        //a[@href='https://cydeo.com/']

        //scroll down to "Powered by CYDEO"
        //SCROLL using Actions class "moveTo(element)" method
        actions.moveToElement(cydeoLink).perform();

        //scroll back up to "Home" link using PageUp button
        actions.sendKeys(Keys.PAGE_UP).perform();

        Driver.closeDriver(); // we created this method in the Driver utility class
        //Driver.getDriver.quit();
    }

        // WE CREATED BELOW TESTS FOR WATCHING  "Driver.closeDriver(); "  method

        @Test
        public void test2 () {
            Driver.getDriver().get("https://practice.cydeo.com/");
            Driver.closeDriver();
        }

    @Test
    public void test3 () {
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }

    @Test
    public void test4 () {
        Driver.getDriver().get("https://practice.cydeo.com/");
        Driver.closeDriver();
    }








}
