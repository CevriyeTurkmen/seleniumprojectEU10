package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T3_Actions_Hover {

    @Test
    public void hovering_test(){
        Driver.getDriver().get("https://practice.cydeo.com/hovers ");
        WebElement image1=Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement image2=Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement image3=Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        WebElement user1=Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2=Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3=Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        Actions actions=new Actions(Driver.getDriver());
        BrowserUtils.sleep(2);
        actions.moveToElement(image1).perform();
        Assert.assertTrue(user1.isDisplayed());


        BrowserUtils.sleep(2);
        actions.moveToElement(image2).perform();
        Assert.assertTrue(user2.isDisplayed());

        BrowserUtils.sleep(2);
        actions.moveToElement(image3).perform();
        Assert.assertTrue(user3.isDisplayed());
    }
}
