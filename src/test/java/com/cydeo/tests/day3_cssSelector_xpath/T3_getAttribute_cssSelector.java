package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T3_getAttribute_cssSelector {
    public static void main(String[] args) {
      WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/  ");

        WebElement signButton=driver.findElement(By.cssSelector("input[class='login-btn']"));
        String expected="Log In ";
        String actual=signButton.getAttribute("value");

        if (actual.equals(expected)){
            System.out.println("Log in verification passed");
        }else {
            System.out.println("Log in verification failed");}









    }
}
