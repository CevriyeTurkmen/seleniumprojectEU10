package com.cydeo.tests.day8_WebTables_Properties_ConfigurationReader;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Homework_FindElements {
    WebDriver driver;

    @BeforeMethod

    public void SetUp(){

        driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

@Test
    public void Test1_NumberOfLinks(){
        driver.get("https://www.openxcell.com");
    List<WebElement>links=driver.findElements(By.tagName("a"));
    System.out.println("links.size() = " + links.size());

}

@Test

    public void Test2_PrintingTheLinks(){
    driver.get("https://www.openxcell.com");
    List<WebElement>links=driver.findElements(By.tagName("a"));
    for (WebElement each : links) {
        System.out.println(each.getText());
    }

}

@Test
    public void Test3_NumberOfLinksWithoutText(){
int count=0;
    driver.get("https://www.openxcell.com");
    List<WebElement>links=driver.findElements(By.tagName("a"));
    for (WebElement each : links) {
        String eachElement= each.getText();

        if (eachElement.isEmpty()||eachElement.isBlank()){
            count++;

        }

    }

    System.out.println(count);


}
}
