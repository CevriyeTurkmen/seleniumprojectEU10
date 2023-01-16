package com.cydeo.tests.day7_WebTables_utilities_JavaFaker;

import com.cydeo.tests.base.TestBase;
import com.cydeo.utilities.CRM_Utilities;
import org.testng.annotations.Test;

public class T3_CRM_Login extends TestBase {


    @Test
    public void Crm_Login_Test() {
        driver.get("https://login1.nextbasecrm.com/ ");

        CRM_Utilities.crm_login(driver);

    }

    @Test
    public void Crm_Login_Test2() {

        driver.get("https://login1.nextbasecrm.com/ ");

        CRM_Utilities.crm_login(driver,"helpdesk1@cybertekschool.com","UserUser");

    }
}
/*
        WebElement inputName = driver.findElement(By.xpath("//input[@name='USER_LOGIN']"));
        inputName.sendKeys("helpdesk1@cybertekschool.com");
        WebElement inputPassword = driver.findElement(By.xpath("//input[@name='USER_PASSWORD']"));
        inputPassword.sendKeys("UserUser");
        WebElement loginButton = driver.findElement(By.xpath("//input[@value='Log In']"));
        loginButton.click();

        BrowserUtils.verifyTitle(driver,"My tasks");


 */








