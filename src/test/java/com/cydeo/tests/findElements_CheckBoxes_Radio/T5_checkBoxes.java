package com.cydeo.tests.findElements_CheckBoxes_Radio;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.concurrent.TimeUnit;

public class T5_checkBoxes {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/checkboxes");
        WebElement checkbox1=driver.findElement(By.xpath("//input[@name='checkbox1']"));
        WebElement checkbox2=driver.findElement(By.xpath("//input[@name='checkbox2']"));
        System.out.println("checkbox1.isSelected() = " + checkbox1.isSelected());


    }
}
