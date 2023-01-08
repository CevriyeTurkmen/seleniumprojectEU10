package com.cydeo.tests.day5_testNg_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T7_NonSelectDropdown {

    public WebDriver driver;

    @Test
    public void NonSelectDropdown() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown ");
        WebElement dropdown= driver.findElement(By.xpath("//a[@id='dropdownMenuLink' ]"));
        dropdown.click();

       WebElement facebook= driver.findElement(By.xpath("//a[.='Facebook']"));
       facebook.click();
       String expectedtitle="Facebook – log in or sign up";
       String actualtitle=driver.getTitle();
        WebElement acceptFace= driver.findElement(By.xpath("//button[@data-cookiebanner='accept_button']"));
        acceptFace.click();
        Assert.assertEquals(expectedtitle,actualtitle, "Title verification failed");






    }
}
