package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LibraryLoginPage {

    //1- initialize the driver instance and object of the class

    public LibraryLoginPage(){  //constructor

        /* initElements method will create connection in between the current driver session(instance)
        and the object of the current class.
        */
        PageFactory.initElements(Driver.getDriver(), this);
        //                                                "this" refers the object of current class
    }

    //2- Use  @FindBy annotation to locate web elements

    @FindBy(xpath = "//input[@id='inputEmail']")  //IT IS find element method for POM
    public WebElement inputUsername;  // IT IS A VARIABLE WITH PUBLIC ACCESS MODIFIER

    @FindBy(id = "inputPassword")
    public WebElement inputPassword;

    @FindBy(xpath = "//button[.='Sign in']")
    public WebElement signInButton;

    @FindBy(xpath = "//div[.='This field is required.']/div")
    public WebElement fieldRequiredErrorMessage;

    @FindBy(xpath = "//div[.='Please enter a valid email address.']/div")
    public WebElement enterValidEmailErrorMessage;

    @FindBy(xpath = "//div[.='Sorry, Wrong Email or Password']")
    public WebElement wrongEmailOrPasswordErrorMessage;








}
