package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T4_cssSelector_getText {
    public static void main(String[] args) {

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/?forgot_password=yes ");
        WebElement Reset= driver.findElement(By.cssSelector("button[class='login-btn']"));
        String expectedReset="Reset password";
        String actualReset=Reset.getText();

        if (actualReset.equals(expectedReset)){
            System.out.println("passed");

        }else {
            System.out.println("failed");}


        System.out.println("actualReset = " + actualReset);
        System.out.println("expectedReset = " + expectedReset);








    }
}
