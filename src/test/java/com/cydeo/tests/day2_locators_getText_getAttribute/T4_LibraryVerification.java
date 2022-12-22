package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T4_LibraryVerification {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://library2.cybertekschool.com/login.html");
        WebElement Username= driver.findElement(By.className("form-control"));
        Username.sendKeys("abcbjebfkje");
        WebElement Password= driver.findElement(By.id("inputPassword"));
        Password.sendKeys("vdvaFHOegkm");




    }
}
