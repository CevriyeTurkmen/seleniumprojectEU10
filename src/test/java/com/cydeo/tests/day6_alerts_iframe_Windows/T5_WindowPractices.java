package com.cydeo.tests.day6_alerts_iframe_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T5_WindowPractices {


    public WebDriver driver;

    @BeforeMethod
    public void SetupMethod(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/windows");
    }

    @Test
    public void WindowPractice(){

        String mainHandle= driver.getWindowHandle();
        System.out.println("mainHandle = " + mainHandle);

        String expectedTitle="Windows";
        String actualTitle=driver.getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);

        System.out.println("Title before click "+ actualTitle);


        WebElement clickHere= driver.findElement(By.xpath("//a[.='Click Here']"));
        clickHere.click();

        for (String each: driver.getWindowHandles()){

            driver.switchTo().window(each);

        }
        System.out.println("Current title after switching : "+ driver.getTitle());

        String expectedTitleAfterClick="New Window";
        actualTitle= driver.getTitle();
        Assert.assertEquals(actualTitle,expectedTitleAfterClick);

        System.out.println("Title after click "+ actualTitle);

    }

    @AfterMethod
    public void TearDownMethod(){

        driver.quit();
    }

}

