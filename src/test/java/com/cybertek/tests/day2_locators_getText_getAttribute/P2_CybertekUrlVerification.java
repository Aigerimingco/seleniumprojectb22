package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P2_CybertekUrlVerification {
    public static void main(String[] args) {
           /*
        TC #2: Cybertekpractice toolverifications
        1.Open Chrome browser
        2.Go to https://practice.cybertekschool.com
        3.Verify URL containsExpected: cybertekschool
        4.Verify title: Expected: Practice
         */

        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/");

        String expectedInUrl="cybertekschool";
        String actualUrl= driver.getCurrentUrl();


        if(actualUrl.contains(expectedInUrl)){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }


        String expTitle="Practice";
        String actualTitle=driver.getTitle();
        if(actualTitle.equals(expTitle)){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed");
        }
    }
}
