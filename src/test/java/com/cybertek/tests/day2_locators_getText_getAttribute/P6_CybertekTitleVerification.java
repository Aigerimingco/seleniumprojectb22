package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P6_CybertekTitleVerification {
    public static void main(String[] args) throws InterruptedException {

       // 1. Open Chrome browser
       // 2. Go to http://practice.cybertekschool.com/inputs


        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://practice.cybertekschool.com/inputs");

        // 3. Click “Home” button
        //1) locate the web element using class attribute value
        //2) click
        Thread.sleep(3000);
        driver.findElement(By.className("nav-link")).click();
        // 4. Verify title as expected:
        // Expected: Practice
        String ExpectedTitle="Practice";
        String actualTitle= driver.getTitle();


        if(actualTitle.equals(ExpectedTitle)){
            System.out.println("Title verification PASSED");
        }else{
            System.out.println("Title verification FAILED!" );
        }
        driver.close();
    }
}
