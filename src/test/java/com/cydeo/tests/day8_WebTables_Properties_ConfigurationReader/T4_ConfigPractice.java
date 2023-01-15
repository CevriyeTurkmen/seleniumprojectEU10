package com.cydeo.tests.day8_WebTables_Properties_ConfigurationReader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_ConfigPractice {

    public WebDriver driver;

    @BeforeMethod

    public void SetUpMethod() {

        String browserType= ConfigurationReader.getProperty("browser");

        driver = WebDriverFactory.getDriver(browserType);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://google.com ");
    }

    @Test
    public void google_search_test(){

        WebElement googleSearchBox= driver.findElement(By.xpath("//input[@name='q']"));
        WebElement acceptbutton= driver.findElement(By.xpath("//div[.='Accept all']"));
        acceptbutton.click();
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        String expectedTitle=ConfigurationReader.getProperty("searchValue") +" - Google Search";
        String actualTitle= driver.getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);



    }
}
