package com.cydeo.tests.day8_WebTables_Properties_ConfigurationReader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class T1_WebTablesPractice {

    WebDriver driver;

    @BeforeMethod

    public void SetUpMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

@Test
    public void WebTables_Test1(){
        driver.get("https://practice.cydeo.com/web-tables ");
        WebElement Bob= driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']"));
        String actual=Bob.getText();
        String expected="Bob Martin";
    Assert.assertEquals(actual,expected);

    WebElement BobDate=
            driver.findElement(By.xpath("//table[@class='SampleTable']//td[.='Bob Martin']/following-sibling::td[3]"));
String expectedBobdate="12/31/2021";
String actualBobdate=BobDate.getText();

Assert.assertEquals(expectedBobdate,actualBobdate);

}
}
