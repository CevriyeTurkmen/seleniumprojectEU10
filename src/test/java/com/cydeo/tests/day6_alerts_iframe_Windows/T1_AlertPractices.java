package com.cydeo.tests.day6_alerts_iframe_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_AlertPractices {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts ");
    }

    @Test
    public void Alert_Task1() {


        WebElement JSAlert = driver.findElement(By.xpath("//button[.='Click for JS Alert']"));
        JSAlert.click();

        Alert alert=driver.switchTo().alert();
        alert.accept();

        WebElement Result=driver.findElement(By.xpath("//p[@id='result']"));
        Assert.assertTrue(Result.isDisplayed());

        String actual= Result.getText();
        String expected="You successfully clicked an alert";
        Assert.assertEquals(actual,expected);

    }
}
