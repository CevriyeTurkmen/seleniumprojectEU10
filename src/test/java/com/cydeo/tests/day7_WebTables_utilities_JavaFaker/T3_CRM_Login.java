package com.cydeo.tests.day7_WebTables_utilities_JavaFaker;

import com.cydeo.utilities.CRM_Utilities;
import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T3_CRM_Login {

    WebDriver driver;

    @BeforeMethod

    public void SetUpMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }


    @Test
    public void Crm_Login_Test() {
        driver.get("https://login1.nextbasecrm.com/ ");

        CRM_Utilities.crm_login(driver);


/*
        WebElement inputName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputName.sendKeys("helpdesk1@cybertekschool.com");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        BrowserUtils.verifyTitle(driver,"My tasks");


 */




    }


}
