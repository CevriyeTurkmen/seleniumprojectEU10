package com.cydeo.tests.day5_testNg_Intro_dropdowns;

import org.testng.annotations.*;

public class TestNg_Intro {

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

    @Test
    public void test1() {
        System.out.println("Test 1 is running");
    }

    @Test
    public void test2() {
        System.out.println("Test 2 is running");

    }

}
