package com.cydeo.tests.day6_alerts_iframe_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_IframePractices {

    public WebDriver driver;

    @BeforeMethod
    public void SetupMethod(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/iframe ");
    }

    @Test
    public void iframePractices(){
        driver.switchTo().frame("mce_0_ifr");

        WebElement contentText= driver.findElement(By.xpath("//p"));
        Assert.assertTrue(contentText.isDisplayed());
        driver.switchTo().parentFrame();

        WebElement headerText= driver.findElement(By.xpath("//h3"));
        Assert.assertTrue(headerText.isDisplayed());

    }

}
