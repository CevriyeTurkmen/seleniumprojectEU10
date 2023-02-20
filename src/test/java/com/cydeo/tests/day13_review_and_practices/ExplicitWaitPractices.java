package com.cydeo.tests.day13_review_and_practices;

import com.cydeo.utilities.Driver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ExplicitWaitPractices {
    @BeforeMethod
    public void setupMethod(){
        Driver.getDriver().get("https://practice.cydeo.com/dynamic_controls");

    }

    @Test
    public void remove_button_test(){



    }




}
