package com.cydeo.tests.day5_testNg_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T4_SimpleDropdowns {
    WebDriver driver;

    @BeforeMethod
    public void SetupMethod() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown");


    }

    @Test
    public void SimpleDropDownTest() {

        Select SimpleDropDown= new Select(driver.findElement(By.xpath("//select[@id='dropdown']")));

        String actual=SimpleDropDown.getFirstSelectedOption().getText();
        String expected="Please select an option";

        Assert.assertEquals(actual,expected);

        Select SimpleDropDown2= new Select(driver.findElement(By.xpath("//select[@id='state']")));

        String actual2=SimpleDropDown2.getFirstSelectedOption().getText();
        String expected2="Select a State";

        Assert.assertEquals(actual2,expected2);



    }


}
