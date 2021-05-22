package com.cybertek.tests.day2_locators_getText_getAttribute;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P3_NavigationAndVerification {
    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        // 2-Go to google.com
        driver.get("https://www.google.com/");
        // 3-Click to Gmail from top right.
        //locating the element ----> click
        //driver.findElement(By.linkText("Gmail")).click();
        driver.findElement(By.partialLinkText("Mail")).click();

        //4- Verify title contains:
        //Expected:Gmail

        String expectedTitle = "Gmail";
        String actualTitle = driver.getTitle();
        if (actualTitle.contains(expectedTitle)) {
            System.out.println("Title verification Passed! ");
        } else {
            System.out.println("Title verification Failed!");
        }
        //5-Go back to Google by using the .back();
        driver.navigate().back();
        //6-Verify Title equals:
        //Expected: Google

        String expectedTitle1 = "Google";
        String actualTitle1 = driver.getTitle();

        if (actualTitle1.contains(expectedTitle1)) {
            System.out.println("Title verification Passed! ");
        } else {
            System.out.println("Title verification Failed! ");
        }

    }
}
