package com.cydeo.tests.day11_actions_jsexecutor_practice;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JSExecutor {

    // Use below provided JS method only for scrolling
    //JavaScript method to use : arguments[0].scrollIntoView(true)

    @Test
    public void task7_scroll_test(){

        Driver.getDriver().get("https://practice.cydeo.com/large");

        //Down-casting our driver type to JavascriptExecutor,
        // so we are able to use the methods coming from that interface

        //3- Scroll down to “Cydeo” link
        WebElement cydeoLink= Driver.getDriver().findElement(By.linkText("CYDEO"));

        //down-casting our driver type to JavascriptExecutor then we're able to use the methods coming from that interface
        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

        js.executeScript("arguments[0].scrollIntoView(true)", cydeoLink);

        //4- Scroll up to “Home” link
        WebElement homeLink= Driver.getDriver().findElement(By.linkText("Home"));

        // js.executeScript("arguments[0].scrollIntoView(true)",homeLink);
        js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink, homeLink);
                                                        // index    0     ,    1

        //js.executeScript("arguments[1].scrollIntoView(true)", cydeoLink, homeLink);





        //JavaScript's method to use : arguments[0].scrollIntoView(true)

    }


}
