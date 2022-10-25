package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_Upload_Practice {


    // OUR GOAL IS TO UPLOAD A FILE  WITH PATH
    // ( RIGHT CLICK ON THE FILE AND GO TO PROPERTIES AND SECURITY option then COPY PASTE ObjectName)

    @Test
    public void upload_test(){

        //1- go to https://practice.cydeo.com/upload
        Driver.getDriver().get("https://practice.cydeo.com/upload");

        //2- fill some small file on your computer and get the path of it
        String path= "C:\\Users\\hicre\\OneDrive\\Masaüstü\\HTML Class\\sunnyDay.jpg";
        //3- upload the file (first we will locate "choose file"button after that locate "upload button)
        WebElement fileUpload= Driver.getDriver().findElement(By.id("file-upload"));

        BrowserUtils.sleep(2);
       // fileUpload.click();  ----> DIDNT WORK
        fileUpload.sendKeys(path);

        WebElement uploadButton= Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();



        //4- assert, File uploaded text is displayed on the page

        WebElement fileUploadedHeader= Driver.getDriver().findElement(By.tagName("h3"));

        Assert.assertTrue(fileUploadedHeader.isDisplayed());





    }




}
