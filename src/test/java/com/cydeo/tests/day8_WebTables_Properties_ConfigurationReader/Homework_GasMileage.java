package com.cydeo.tests.day8_WebTables_Properties_ConfigurationReader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Homework_GasMileage {
    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test

    public void GasMileageCalculator() {
        driver.get("https://www.calculator.net ");
        WebElement seachBox = driver.findElement(By.xpath("//input[@id='calcSearchTerm']"));
        seachBox.sendKeys("gas mileage");
        WebElement gasMileageCalculator = driver.findElement(By.xpath("//a[.='Gas Mileage Calculator']"));
        gasMileageCalculator.click();
//a
        String expected = "Gas Mileage Calculator";
        String actual = driver.getTitle();
        Assert.assertEquals(actual, expected);

        //b
        WebElement label = driver.findElement(By.xpath("//h1[.='Gas Mileage Calculator']"));
        label.isDisplayed();

        WebElement CurrentOdometer = driver.findElement(By.xpath("//input[@id='mucodreading']"));
        CurrentOdometer.clear();
        CurrentOdometer.sendKeys("7925");

        WebElement PreviousOdometer = driver.findElement(By.xpath("//input[@id='mupodreading']"));
        PreviousOdometer.clear();
        PreviousOdometer.sendKeys("7550");

        WebElement GasAdded = driver.findElement(By.xpath("//input[@id='mugasputin']"));
        GasAdded.clear();
        GasAdded.sendKeys("16");

        WebElement GasPrice = driver.findElement(By.xpath("//input[@id='mugasprice']"));
        GasPrice.clear();
        GasPrice.sendKeys("3.55");

        WebElement calculate = driver.findElement(By.xpath("//table[@id='metric']//input[@style='margin-top:10px;']"));
        calculate.click();

        WebElement mpg = driver.findElement(By.xpath("//span[.='(55.13 mpg)']"));
        String actualMpg = mpg.getText();
        String expectedMpg = "(55.13 mpg)";

        Assert.assertEquals(actualMpg, expectedMpg, "Verification failed");


    }


}





