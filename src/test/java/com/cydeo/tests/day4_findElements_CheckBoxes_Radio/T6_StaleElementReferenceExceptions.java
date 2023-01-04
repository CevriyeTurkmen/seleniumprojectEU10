package com.cydeo.tests.day4_findElements_CheckBoxes_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceExceptions {
    public static void main(String[] args) {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/abtest ");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement Cydeo=driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("Cydeo.isDisplayed() = " + Cydeo.isDisplayed());
        driver.navigate().refresh();

        Cydeo=driver.findElement(By.xpath("//a[@target='_blank']"));
        System.out.println("Cydeo.isDisplayed() = " + Cydeo.isDisplayed());




    }
}
