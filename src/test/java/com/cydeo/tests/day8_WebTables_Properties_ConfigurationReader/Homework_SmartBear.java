package com.cydeo.tests.day8_WebTables_Properties_ConfigurationReader;

import com.cydeo.utilities.WebDriverFactory;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class Homework_SmartBear {

    WebDriver driver;

    @BeforeMethod
    public void SetUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @Test
    public void Test1_SmartBear_LinkVerification() {
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");
        WebElement username = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
        List<WebElement> links = driver.findElements(By.tagName("a"));
        System.out.println("links.size() = " + links.size());

        for (WebElement link : links) {
            System.out.println(link.getText());
        }


    }

    @Test(priority = 1)
    public void Test2_SmartBear_OrderPlacing() {

        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");
        WebElement username = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
        WebElement order = driver.findElement(By.xpath("//a[.='Order']"));
        order.click();
        Select family = new Select(driver.findElement(By.xpath("//select[@id='ctl00_MainContent_fmwOrder_ddlProduct']")));
        family.selectByValue("FamilyAlbum");
        WebElement quantity = driver.findElement(By.name("ctl00$MainContent$fmwOrder$txtQuantity"));
        quantity.sendKeys("2");
        WebElement calculate = driver.findElement(By.xpath("//input[@value='Calculate']"));
        calculate.click();

        WebElement name = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']"));
        Faker faker = new Faker();
        name.sendKeys(faker.name().fullName());

        WebElement street = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']/following::input[1]"));
        street.sendKeys(faker.address().streetName());

        WebElement City = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']/following::input[2]"));
        City.sendKeys(faker.address().city());

        WebElement State = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']/following::input[3]"));
        State.sendKeys(faker.address().state());

        WebElement Zip = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_txtName']/following::input[4]"));
        Zip.sendKeys(faker.address().zipCode());

        WebElement VisaButton = driver.findElement(By.xpath("//input[@value='Visa']"));
        VisaButton.click();

        WebElement CardNumber = driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']"));
        CardNumber.sendKeys(faker.finance().creditCard().replaceAll("-",""));

        WebElement ExpireDate= driver.findElement(By.xpath("//input[@id='ctl00_MainContent_fmwOrder_TextBox6']/following::input[1]"));
        ExpireDate.sendKeys("12/22");

        WebElement Process = driver.findElement(By.xpath("//a[@id='ctl00_MainContent_fmwOrder_InsertButton']"));
        Process.click();

        WebElement Message= driver.findElement(By.xpath("//strong[.='\n" +
                "                    New order has been successfully added.\n" +
                "                ']"));

        System.out.println("Message.isDisplayed() = " + Message.isDisplayed());


    }

    @Test
    public void Test3_SmartBear_OrderVerification() {
        driver.get("https://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx ");
        WebElement username = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$username']"));
        username.sendKeys("Tester");
        WebElement password = driver.findElement(By.xpath("//input[@name='ctl00$MainContent$password']"));
        password.sendKeys("test");
        WebElement login = driver.findElement(By.xpath("//input[@type='submit']"));
        login.click();
        WebElement vieworders = driver.findElement(By.xpath("//a[.='View all orders']"));
        vieworders.click();
        WebElement OrderDate = driver.findElement(By.xpath("//table[@class='SampleTable']//tr[6]//td[2]/following::td[3]"));
        String actual = OrderDate.getText();
        String expected = "01/05/2010";
        Assert.assertEquals(actual, expected);

    }


}