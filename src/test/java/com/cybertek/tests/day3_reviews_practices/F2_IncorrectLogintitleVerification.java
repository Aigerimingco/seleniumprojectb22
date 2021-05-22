package com.cybertek.tests.day3_reviews_practices;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class F2_IncorrectLogintitleVerification {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver= new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("https://www.facebook.com/");

        WebElement inputUsername= driver.findElement(By.id("email"));

        inputUsername.sendKeys("aikish@yahoo.com");

        WebElement inputPassword= driver.findElement(By.id("pass"));
        inputPassword.sendKeys("$emelek07"+ Keys.ENTER);

        String expectedTitle= "Log into Facebook";
        System.out.println(expectedTitle);

        Thread.sleep(5000);
        String actualTitle=driver.getTitle();
        System.out.println(actualTitle);
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Title verification PASSED!");
        }else{
            System.out.println("Title verification FAILED");
        }



        //driver.close();
    }
}
