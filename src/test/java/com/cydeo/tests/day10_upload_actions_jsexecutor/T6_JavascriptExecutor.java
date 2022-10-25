package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;

public class T6_JavascriptExecutor {

    // T6:  scroll by using JavascriptExecutor

    @Test
    public void javascript_executor_test1(){
        Driver.getDriver().get("https://practice.cydeo.com/infinite_scroll");


        // JavaScript method to use: window.scrollBy(0,0)
        //a. 750 pixels down 10 times.



        //((JavascriptExecutor)Driver.getDriver()).executeScript("");
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();  // just casting

        for (int i = 0; i <10 ; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,750)");


        }

        //b.750 pixels up 10 times
        for (int i = 0; i <10 ; i++) {
            BrowserUtils.sleep(1);
            js.executeScript("window.scrollBy(0,-750)");


        }









    }





}
