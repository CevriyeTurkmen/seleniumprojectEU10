package com.cydeo.tests.day10_upload_actions_jsexecutor;

import com.cydeo.utilities.ConfigurationReader;
import com.cydeo.utilities.Driver;
import com.github.javafaker.Faker;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class T1_Registration_Form {

    @Test
    public void T1_Registration_Form() {

        Driver.getDriver().get(ConfigurationReader.getProperty("registration.form.url"));

        WebElement firstname = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']"));
        Faker faker = new Faker();
        firstname.sendKeys(faker.name().firstName());

        WebElement lastname = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']/following::input"));
        lastname.sendKeys(faker.name().lastName());

        WebElement username = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']/following::input[2]"));
        username.sendKeys("terinakeebler2");

        WebElement email = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']/following::input[3]"));
        email.sendKeys(faker.internet().emailAddress());

        WebElement password = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']/following::input[4]"));
        password.sendKeys(faker.internet().password());

        WebElement phone = Driver.getDriver().findElement(By.xpath("//input[@name='firstname']/following::input[5]"));
        phone.sendKeys(faker.numerify("###-###-####"));
        WebElement gender = Driver.getDriver().findElement(By.xpath("//input[@value='female']"));
        gender.click();

        WebElement birthday = Driver.getDriver().findElement(By.xpath("//input[@name='birthday']"));
        birthday.sendKeys("10/12/1984");

        Select department = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']")));
        department.selectByValue("MCTC");

        Select jobTitle = new Select(Driver.getDriver().findElement(By.xpath("//select[@name='department']/following::select")));
        jobTitle.selectByVisibleText("SDET");

        WebElement language = Driver.getDriver().findElement(By.xpath("//input[@value='java']"));
        language.click();

        WebElement signUp = Driver.getDriver().findElement(By.xpath("//button[@type='submit']"));
        signUp.click();

        String actual=Driver.getDriver().findElement(By.xpath("//div[@class='alert alert-success']//p")).getText();
        String expected="You've successfully completed registration!";

        Assert.assertEquals(actual,expected);

    }
}
