package com.cydeo.tests.day5_testNg_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T1_StaleElementRefEx {
    public static void main(String[] args) {


       /* 1. Open Chrome browser
 // 2. Go to https://practice.cydeo.com/add_remove_elements/
        */

 WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/add_remove_elements/");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

//3. Click to “Add Element” button
        WebElement add=driver.findElement(By.xpath("//button[@onclick='addElement()']"));
        add.click();
//Verify “Delete” button is displayed after clicking.
        WebElement deleteBtn=driver.findElement(By.xpath("//button[.='Delete']"));
        System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());
//Click to “Delete” button.
        deleteBtn.click();
//Verify “Delete” button is NOT displayed after clicking.
        try {
            System.out.println("deleteBtn.isDisplayed() = " + deleteBtn.isDisplayed());

        }catch (StaleElementReferenceException e){
            System.out.println("StaleElementReferenceException is thrown");
            System.out.println("This means the web element is completely deleted from the page");
            System.out.println("deleteBtn.isDisplayed()= false");
        }

//USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS











    }
}
