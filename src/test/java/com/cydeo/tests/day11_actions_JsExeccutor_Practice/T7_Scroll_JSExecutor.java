package com.cydeo.tests.day11_actions_JsExeccutor_Practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class T7_Scroll_JSExecutor {

    @Test
    public void T7_Scroll_Test() {

        Driver.getDriver().get("https://practice.cydeo.com/large ");
       WebElement link= Driver.getDriver().findElement(By.xpath("//a[.='CYDEO']"));
       WebElement home=Driver.getDriver().findElement(By.linkText("Home"));

        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        BrowserUtils.sleep(4);
        js.executeScript("arguments[0].scrollIntoView(true)",link);
        BrowserUtils.sleep(4);
        js.executeScript("arguments[1].scrollIntoView(true)",link,home);



    }
}