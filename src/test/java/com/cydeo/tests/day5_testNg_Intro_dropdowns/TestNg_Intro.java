package com.cydeo.tests.day5_testNg_Intro_dropdowns;

import org.testng.Assert;
import org.testng.annotations.*;

public class TestNg_Intro {


    @Test
    public void test1() {
        System.out.println("Test 1 is running");
        String actual="apple";
        String expected= "apple";

        Assert.assertEquals(actual,expected);
    }

    @Test
    public void test2() {
        System.out.println("Test 2 is running");
        String actual="apple";
        String expected= "apple";
        Assert.assertTrue(actual.equals(expected));

    }

    @BeforeClass
    public void setUpClass(){
        System.out.println("---> Before class is running");
    }

    @AfterClass
    public void tearDownClass(){
        System.out.println("---> After class is running");
    }

    @BeforeMethod
    public void setUpMethod() {
        System.out.println("--> Before method is running");
    }

    @AfterMethod
    public void tearDownMethod() {
        System.out.println("--> After method is running");
    }



}
