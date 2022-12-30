package com.cydeo.tests.findElements_CheckBoxes_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;

import java.util.concurrent.TimeUnit;

public class T6_StaleElementReferenceExceptions {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/abtest ");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);


    }
}
