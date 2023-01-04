package com.cydeo.tests.day5_testNg_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) {

       // 1. Open Chrome browser
        //2. Go to https://practice.cydeo.com/radio_buttons
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //3. Click to “Hockey” radio button
        WebElement hockey=driver.findElement(By.xpath("//input[@id='hockey']"));
        hockey.click();
        //4. Verify “Hockey” radio button is selected after clicking.
        System.out.println("hockey.isSelected() = " + hockey.isSelected());

        //USE XPATH LOCATOR FOR ALL WEBELEMENT LOCATORS

driver.close();




    }
}
