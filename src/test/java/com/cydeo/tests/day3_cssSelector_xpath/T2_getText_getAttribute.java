package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T2_getText_getAttribute {
    public static void main(String[] args) {
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/  ");
        WebElement text= driver.findElement(By.className("login-item-checkbox-label"));
        String expected="Remember me on this computer";
        String actual=text.getText();
        if (expected.equals(actual)){
            System.out.println("Label verification Passed!");
        }else {
            System.out.println("Label verification Failed!");}

        WebElement ForgotPassword = driver.findElement(By.className("login-link-forgot-pass"));
        String expectedLink="Forgot your password? ";
        String actualLink=ForgotPassword.getText();

        if (expectedLink.equals(actualLink)){
            System.out.println("Forgot Password verification Passed!");
        }else {
            System.out.println("actualLink = " + actualLink);
            System.out.println("expectedLink = " + expectedLink);
            System.out.println("Forgot Password Failed!");}

        String expectedHref="forgot_password=yes ";
        String actualHref=ForgotPassword.getAttribute("href");

        if (actualHref.contains(expectedHref)){
            System.out.println("Href Attribute Verification Passed!");
        }else { System.out.println("Href Attribute Verification Passed!");}


    }
}
