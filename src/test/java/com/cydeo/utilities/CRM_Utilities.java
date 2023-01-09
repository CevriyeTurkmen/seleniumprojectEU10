package com.cydeo.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CRM_Utilities {

    public static void crm_login(WebDriver driver){

        WebElement inputName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputName.sendKeys("helpdesk1@cybertekschool.com");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();


    }

    public static void crm_login(WebDriver driver, String userName, String password){

        WebElement inputName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputName.sendKeys(userName);
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys(password);
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();


    }
}
