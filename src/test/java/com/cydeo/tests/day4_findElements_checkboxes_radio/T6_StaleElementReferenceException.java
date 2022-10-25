package com.cydeo.tests.day4_findElements_checkboxes_radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceException {
    public static void main(String[] args) {


        //   (   TC #6: StaleElementReferenceException Task  ) how to handle it
        //if the webElement is DELETED we have to use TRY-CATCH method
        //if we NAVIGATED the page then we have to RE-ASSIGN(re-locate) the webElement

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();


        //Providing extra wait time for our driver before it throws NoSuchElementException
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //2- Go to: https://practice.cydeo.com/abtest
        driver.get("https://practice.cydeo.com/abtest");

        //3- Locate “CYDEO” link, verify it is displayed.
        WebElement cydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));


        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());  // T (boolean)

        //4- Refresh the page.
        driver.navigate().refresh();   // after that, the webElement is lost

        //We are refreshing the web element reference by re-assigning (re-locating) the web element
        cydeoLink= driver.findElement(By.xpath("//a[text()='CYDEO']"));

        //5- Verify it is displayed, again.
        System.out.println("cydeoLink.isDisplayed() = " + cydeoLink.isDisplayed());  // T (boolean)




    }
}
