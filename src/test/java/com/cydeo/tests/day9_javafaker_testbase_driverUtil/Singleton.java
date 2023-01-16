package com.cydeo.tests.day9_javafaker_testbase_driverUtil;

public class Singleton {

    private Singleton(){}

    private static String word;

    public static String getWord(){

        if (word==null){
            System.out.println("First time call.Word object is null.Assigning value to it now.");
            word="Something";
        }else
        {
            System.out.println("World already has a value");
        }

        return word;
    }

}
