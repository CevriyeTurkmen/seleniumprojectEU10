package com.cydeo.tests.day6_alerts_iframe_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    public WebDriver driver;

    @BeforeMethod
    public void setUpMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown ");
    }

    @Test
    public void dropDown_task5() {

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        dropdown.selectByVisibleText("Illinois");
        dropdown.selectByValue("VA");
        dropdown.selectByIndex(5);

        String expected = "California";
        String actual = dropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(expected, actual);

    }


    @Test
    public void dropDown_task6() {

        Select yearDropdown = new Select(driver.findElement(By.xpath("//select[@id='year']")));
        Select monthDropdown = new Select(driver.findElement(By.xpath("//select[@id='month']")));
        Select dayDropdown = new Select(driver.findElement(By.xpath("//select[@id='day']")));

        yearDropdown.selectByVisibleText("1924");
        monthDropdown.selectByValue("11");
        dayDropdown.selectByIndex(0);

        String expectedYear = "1924";
        String expectedMonth = "December";
        String expectedDay = "1";

        String actualYear = yearDropdown.getFirstSelectedOption().getText();
        String actualMonth = monthDropdown.getFirstSelectedOption().getText();
        String actualDay = dayDropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(expectedYear, actualYear);
        Assert.assertTrue(actualMonth.equals(expectedMonth));
        Assert.assertEquals(actualDay, expectedDay);



    }
    @AfterMethod
    public void tearDownMethod(){
        driver.close();
    }
}