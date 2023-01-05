package com.cydeo.tests.day5_testNg_Intro_dropdowns;

import com.cydeo.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class T3_RadioButton_cont {
    public static void main(String[] args) {

        //2. Go to https://practice.cydeo.com/radio_buttons
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://practice.cydeo.com/radio_buttons");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        clickAndVerifyRadioButton(driver, "sport","hockey");
        clickAndVerifyRadioButton(driver,"color","yellow");
    }


    public static void clickAndVerifyRadioButton(WebDriver driver, String nameAttribute, String idValue) {

        List<WebElement> RadioButtons = driver.findElements(By.name(nameAttribute));

        for (WebElement each : RadioButtons) {

            String eachID = each.getAttribute("id");

            if (eachID.equals(idValue)) {
                each.click();
                System.out.println(eachID+" is selected =" + each.isSelected());
                break;


            }

        }
        driver.close();
    }

}


