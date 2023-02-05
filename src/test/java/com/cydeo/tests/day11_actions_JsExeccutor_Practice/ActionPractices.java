package com.cydeo.tests.day11_actions_JsExeccutor_Practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ActionPractices {

    @Test
    public void task_4_and_5_test() {

        Driver.getDriver().get("https://practice.cydeo.com/ ");
        WebElement PoweredBy = Driver.getDriver().findElement(By.xpath("//div[@style='text-align: center;']"));
        Actions actions = new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);
        actions.moveToElement(PoweredBy).perform();
/*
        WebElement home=Driver.getDriver().findElement(By.xpath("//a[.='Home']"));
        BrowserUtils.sleep(3);
        actions.moveToElement(home).perform();

 */

        actions.sendKeys(Keys.PAGE_UP, Keys.PAGE_UP).perform();

        Driver.closeDriver();

    }

    public void test2(){

        Driver.getDriver().get("https://practice.cydeo.com/ ");

        Driver.closeDriver();
    }
}
