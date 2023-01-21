package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T2_UploadPractice {
    @Test

    public void upload_test(){

        Driver.getDriver().get("https://practice.cydeo.com/upload ");
        String path="C:\\Users\\gamze\\OneDrive\\Desktop\\HTML Class\\sunny.jpg";
        WebElement fileUpload=Driver.getDriver().findElement(By.xpath("//input[@id='file-upload']"));
        fileUpload.sendKeys(path);
        WebElement uploadButton=Driver.getDriver().findElement(By.id("file-submit"));
        uploadButton.click();
        WebElement verify=Driver.getDriver().findElement(By.xpath("//h3[.='File Uploaded!']"));
        Assert.assertTrue(verify.isDisplayed());



    }
}
