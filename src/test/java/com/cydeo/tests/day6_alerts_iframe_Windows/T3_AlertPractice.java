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

public class T3_AlertPractice {

    public WebDriver driver;

    @BeforeMethod
    public void setupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cydeo.com/javascript_alerts ");
    }
    @Test
    public void AlertTask3(){

        WebElement JsPrompt= driver.findElement(By.xpath("//button[.='Click for JS Prompt']"));
        JsPrompt.click();
        Alert alert=driver.switchTo().alert();
        alert.sendKeys("hello");
        alert.accept();

        WebElement Result=driver.findElement(By.xpath("//p[@style='color:green']"));
        String expected="You entered: hello";
        String actual= Result.getText();
        Assert.assertEquals(expected,actual);


    }
}
