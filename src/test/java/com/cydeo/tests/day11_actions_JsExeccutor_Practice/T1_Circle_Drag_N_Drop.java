package com.cydeo.tests.day11_actions_JsExeccutor_Practice;

import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Circle_Drag_N_Drop {
    @Test
    public void T1_Drag_Drop_test(){

        Driver.getDriver().get("https://demos.telerik.com/kendo-ui/dragdrop/index ");
        WebElement cookies=Driver.getDriver().findElement(By.xpath("//button[.='Accept and Close']"));
        cookies.click();
        WebElement smallCircle=Driver.getDriver().findElement(By.id("draggable"));
        WebElement bigCircle=Driver.getDriver().findElement(By.id("droptarget"));
        BrowserUtils.sleep(2);
        Actions actions=new Actions(Driver.getDriver());
        actions.pause(2000).dragAndDrop(smallCircle,bigCircle).perform();
        String actual_text=bigCircle.getText();
        String expected_text="You did great!";

        Assert.assertEquals(actual_text,expected_text);










    }
}
