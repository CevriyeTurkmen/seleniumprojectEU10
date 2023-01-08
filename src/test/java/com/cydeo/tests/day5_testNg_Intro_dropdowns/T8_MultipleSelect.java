package com.cydeo.tests.day5_testNg_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T8_MultipleSelect {

    @Test
    public void MultipleSelect() {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/dropdown ");

        Select multiElement = new Select(driver.findElement(By.xpath("//select[@name='Languages']")));
        java.util.List<WebElement> allOptions = multiElement.getOptions();

        for (WebElement each : allOptions) {
            each.click();

            System.out.println("all selected values = " + each.getText());
        }
        multiElement.deselectAll();
    }

}
