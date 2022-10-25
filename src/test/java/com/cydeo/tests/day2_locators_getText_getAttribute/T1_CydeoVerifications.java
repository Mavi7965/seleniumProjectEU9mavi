package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_CydeoVerifications {
    public static void main(String[] args) {

        /*
        IN THIS CLASS WE ARE SOLVING DAY2,  TASK 1
         */

        // Cydeo practice tool verifications
        //1- open chrome browser
         WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        //2- go to https://practice.cydeo.com
        driver.get("https://practice.cydeo.com");  //OR  driver.navigate().to("https://practice.cydeo.com");


        //3- verify URL contains
        //expected: cydeo
        String expectedURL="cydeo";

        String actualURL=driver.getCurrentUrl();
        if(actualURL.contains(expectedURL)){
            System.out.println("URL verification PASSED!");
        }else{
            System.out.println("URL verification FAILED!!!");
        }

        //4- verify  title:
        // expected : practice
        String expectedTitle="Practice";
        String actualTitle= driver.getTitle();

        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification Passed!");
        }else{
            System.out.println("Title verification FAILED!!!");
        }

        driver.close();












    }
}
