package com.cydeo.tests.day12_pom_design_explicit_wait;

import com.cydeo.pages.LibraryLoginPage;
import com.cydeo.utilities.Driver;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class POMPractices {

    LibraryLoginPage libraryLoginPage;

    @BeforeMethod
            public void setupMethod(){
        Driver.getDriver().get("https://library1.cydeo.com");
        libraryLoginPage = new LibraryLoginPage();

    }



    @Test
    public void required_field_error_message_test() throws InterruptedException {



        libraryLoginPage.signInButton.click();
        Assert.assertTrue(libraryLoginPage.fieldRequiredErrorMessage.isDisplayed());
        Thread.sleep(2000);

        Driver.closeDriver();

    }
        @Test
        public void invalid_email_format_error_message_test () throws InterruptedException {

            libraryLoginPage.inputUsername.sendKeys("abvchavch");
            libraryLoginPage.signInButton.click();
            Assert.assertTrue(libraryLoginPage.enterValidEmailErrorMessage.isDisplayed());
            Thread.sleep(2000);

Driver.closeDriver();
        }

        @Test
    public void library_negative_login(){

            libraryLoginPage.inputUsername.sendKeys("abc@bjrbvj");
            libraryLoginPage.inputPassword.sendKeys("hvueubf");
            libraryLoginPage.signInButton.click();
            Assert.assertTrue(libraryLoginPage.wrongEmailOrPasswordErrorMessage.isDisplayed());

            Driver.closeDriver();
        }


}



