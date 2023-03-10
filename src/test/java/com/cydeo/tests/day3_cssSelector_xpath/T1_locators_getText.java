package com.cydeo.tests.day3_cssSelector_xpath;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T1_locators_getText {
    public static void main(String[] args) {

        //WebDriverManager.chromedriver().setup();
        //WebDriver driver = new ChromeDriver();

        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://login1.nextbasecrm.com/  ");
        //  driver.findElement(By.name("USER_LOGIN")).sendKeys("Incorrect");
        WebElement inputUserName = driver.findElement(By.name("USER_LOGIN"));
        inputUserName.sendKeys("Incorrect");
        WebElement inputPassword = driver.findElement(By.name("USER_PASSWORD"));
        inputPassword.sendKeys("incorrect");
        WebElement loginPage=  driver.findElement(By.className("login-btn"));
        loginPage.click();
        WebElement errortext = driver.findElement(By.className("errortext"));
        String expected="Incorrect login or password";
        String actual=errortext.getText();

        if (actual.equals(expected)){
            System.out.println("Error message verification passed");
        }else {
            System.out.println("Error message verification failed");

        }

    }
}
