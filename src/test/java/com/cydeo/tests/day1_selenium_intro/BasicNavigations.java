package com.cydeo.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {

    public static void main(String[] args) throws InterruptedException {


        //1- set up the browser driver
        WebDriverManager.chromedriver().setup();

        //2- create instance of the Selenium WebDriver
        //This is the line opening an empty browser
        WebDriver driver= new ChromeDriver();

        // This line will maximize the browser size
        driver.manage().window().maximize();
        //driver.manage().window().fullscreen();  Another option for MAC


        //3- go to "https://www.tesla.com"
        driver.get("https://www.tesla.com");

        // get the title of the page
        String currentTitle= driver.getTitle();
        System.out.println("currentTitle = " + currentTitle);

        String currentURL= driver.getCurrentUrl();
        System.out.println("currentURL = " + currentURL);


        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to navigate back
        driver.navigate().back();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        //use selenium to navigate forward
        driver.navigate().forward();

        // Stop code execution for 3 seconds
        Thread.sleep(3000);

        // use selenium to  refresh
        driver.navigate().refresh();


        Thread.sleep(3000);
        //use navigate().to():
        driver.navigate().to("https://www.google.com");

        // get the current title after  getting the google page
        currentTitle= driver.getTitle();


       // System.out.println("driver.getTitle()= " + driver.getTitle());

        System.out.println("currentTitle = " + currentTitle);

        //Get the current URL using Selenium
        currentURL= driver.getCurrentUrl();


        currentURL= driver.getCurrentUrl();

        System.out.println("currentURL = " + currentURL);


        // this will close the currently opened window(only one window)
        driver.close();

        //this will close all  the opened windows( kills the current session/ session is about selenium)
        driver.quit();


    }

}
