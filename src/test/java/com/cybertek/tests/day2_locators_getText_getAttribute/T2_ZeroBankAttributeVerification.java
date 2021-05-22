package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T2_ZeroBankAttributeVerification {
    public static void main(String[] args) {
        //1. Open Chrome browser
        //2. Go to http://zero.webappsecurity.com/login.html



        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("http://zero.webappsecurity.com/login.html");
        // locate the link and store inside of WebElement
        WebElement zeroBankLink = driver.findElement(By.className("brand"));

        // 3. Verify link text from top left:
        // Expected: “Zero Bank”
        String expLinkText= "Zero Bank";
        String actualLinkText= zeroBankLink.getText();
        if(actualLinkText.equals(expLinkText)){
            System.out.println("Passed");
        }else{
            System.out.println("Failed");
        }
        //4. Verify link href attribute value contains:
        //Expected: “index.html”
        //WebElement actualLink= driver.findElement(By.linkText("Zero Bank"));
        String expectedInAttributeValue= "index.html";
        String actualhrefValue= zeroBankLink.getAttribute("href");
        if(actualhrefValue.contains(expectedInAttributeValue)){
            System.out.println("href attribute value PASSED");
        }else{
            System.out.println("href attribute value FAILED");
        }





    }
}
