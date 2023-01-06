package com.cydeo.tests.day6_alerts_iframe_Windows;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class DropdownPractices {
    WebDriver driver;

    @Test
    public void dropDown_task5() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("http://practice.cybertekschool.com/dropdown ");

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='state']")));
        dropdown.selectByVisibleText("Illinois");
        dropdown.selectByValue("VA");
        dropdown.selectByIndex(5);

        String expected="California";
        String actual=dropdown.getFirstSelectedOption().getText();

        Assert.assertEquals(expected,actual);

    }


}
