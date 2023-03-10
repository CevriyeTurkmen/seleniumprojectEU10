package com.cydeo.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_LinkText_Practise {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver=new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com");
WebElement abTest= driver.findElement(By.linkText("A/B Testing"));
abTest.click();

String expectedTitle="No A/B Test";
String actualTitle=driver.getTitle();
if (expectedTitle.equals(actualTitle)){
    System.out.println("Passed");
}else {
    System.out.println("Failed");}

driver.navigate().back();
String expectedTitle2="Practice";
String actualTitle2=driver.getTitle();

if (expectedTitle2.equals(actualTitle2)){
    System.out.println("passed");
}else {
    System.out.println("failed");}

    }
}
