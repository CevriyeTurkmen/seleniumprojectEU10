package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T5_getText_getAttribute_Practice {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/registration_form");

WebElement header= driver.findElement(By.tagName("h2"));
        String ExpectedheaderText="Registration form";
        String ActualheaderText=header.getText();

        if (ExpectedheaderText.equals(ActualheaderText)){
            System.out.println("Passed");
        }else {
            System.out.println("Failed");}










    }
}
