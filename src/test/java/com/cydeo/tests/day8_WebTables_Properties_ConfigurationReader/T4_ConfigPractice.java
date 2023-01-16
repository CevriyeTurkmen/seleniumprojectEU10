package com.cydeo.tests.day8_WebTables_Properties_ConfigurationReader;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T4_ConfigPractice {

   // public WebDriver driver;

  //  @BeforeMethod

   // public void SetUpMethod() {

     //   String browserType= ConfigurationReader.getProperty("browser");

     //   driver = WebDriverFactory.getDriver(browserType);
    //    driver.manage().window().maximize();
   //     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

  //  }

    @Test
    public void google_search_test(){

        Driver.getDriver().get("https://google.com ");
        WebElement googleSearchBox= Driver.getDriver().findElement(By.xpath("//input[@name='q']"));
        WebElement acceptbutton= Driver.getDriver().findElement(By.xpath("//div[.='Accept all']"));
        acceptbutton.click();
        googleSearchBox.sendKeys(ConfigurationReader.getProperty("searchValue")+ Keys.ENTER);

        String expectedTitle=ConfigurationReader.getProperty("searchValue") +" - Google Search";
        String actualTitle= Driver.getDriver().getTitle();

        Assert.assertEquals(actualTitle,expectedTitle);



    }
}
