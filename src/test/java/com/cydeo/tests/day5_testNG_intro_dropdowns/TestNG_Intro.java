package com.cydeo.tests.day5_testNG_intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNG_Intro {


           // ANNOTATIONS AND  ASSERTIONS :



    @Test    // I CAN RUN ONLY THIS TEST IF  I WANT
    public void test1(){
        System.out.println("Test 1 is running...");

        // ASSERT EQUALS: compare 2 of the same things
        String actual= "apple";
        String expected= "apple";
        Assert.assertEquals(actual, expected);


    }





    @Test
    public void test2(){
        System.out.println("Test 2 is running...");

        //ASSERT TRUE
        String actual= "apple";
        String expected= "apple";
        Assert.assertTrue(actual.equals(expected));
    }


    @BeforeClass  // runs before class once !
    public void setupMethod(){
        System.out.println("------>BeforeClass is running!");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("------>AfterClass is running!");
    }


    @BeforeMethod  // runs before every Test
    public void setUpMethod(){
        System.out.println("----> BeforeMethod is running!");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("----> AfterMethod is running!");
    }






}
