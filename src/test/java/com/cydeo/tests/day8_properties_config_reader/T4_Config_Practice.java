package com.cydeo.tests.day8_properties_config_reader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_Config_Practice {

   /* public WebDriver driver;

    @BeforeMethod
    public void setupMethod(){

        //we are getting the browserType dynamiclly from our configuration.properties file
        String browserType= ConfigurationReader.getProperty("browser");   // !!!!!!!
        driver= WebDriverFactory.getDriver(browserType);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    } -----  WE WILL USE Driver.getDriver() method  instead of above those lines.-----

    */




    @Test
    public void google_search_test(){

        Driver.getDriver().get("https://www.google.com");

        // these 2 lines for handling pop-ups
        WebElement pop_upsHandling=Driver.getDriver().findElement(By.xpath("//div[.='Avvisa alla']"));
        pop_upsHandling.click();

        //3-write "apple" in google search box
        WebElement googleSearchBox= Driver.getDriver().findElement(By.xpath("//input[@name='q']"));

        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        //4- verify title
        //expected: apple - Sök på Google
        String expectedTitle= ConfigurationReader.getProperty("searchValue") + " - Sök på Google";
        String actualTitle= Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle, expectedTitle);

    }

}
