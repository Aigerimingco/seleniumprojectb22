package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T1_ZeroBankHeaderTextVerification {
    public static void main(String[] args) {
       // 1. Open Chrome browser
       // 2. Go to http://zero.webappsecurity.com/login.html



        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        // 3. Verify header text
        //  Expected: “Log in to ZeroBank”
        //1) locate the web element
        //2) get the text of it using getText() method
        String expHeader= "Log in to ZeroBank";
        WebElement actualHeader= driver.findElement(By.tagName("h3"));

        String actualHeaderText= actualHeader.getText();;

        if(actualHeaderText.equals(expHeader)){
            System.out.println("PASSED");
        }else{
            System.out.println("FAILED");
        }



       // driver.close();
    }
}
