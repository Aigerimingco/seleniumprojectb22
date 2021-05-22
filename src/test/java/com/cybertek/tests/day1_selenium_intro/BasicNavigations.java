package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicNavigations {
    public static void main(String[] args) throws InterruptedException {

        // 1- setup the browser driver

        WebDriverManager.chromedriver().setup();

        // 2- create instance of selenium web driver
        WebDriver driver= new ChromeDriver();

        // this line will max browser size
        driver.manage().window().maximize();
        driver.manage().window().fullscreen();

        //3- get the page for tesla.com

        driver.get("https://www.tesla.com");
        System.out.println("Current title: "+driver.getTitle());
        String currentUrl= driver.getCurrentUrl();
        System.out.println("currentUrl = " + currentUrl);

       // putting 3 seconds of wait/ stops the code for 3 seconds
        Thread.sleep(2000);
        // going back using navigation
        driver.navigate().back();

        Thread.sleep(2000);

        //going forward using navigation
        driver.navigate().forward();

        Thread.sleep(2000);
        // refreshing the page using navigation
        driver.navigate().refresh();

        // going to another url using .to() method
        driver.navigate().to("https://google.com");
        System.out.println("Current title: "+driver.getTitle());
        currentUrl= driver.getCurrentUrl();

        System.out.println("currentUrl = " + currentUrl);

        driver.close();


    




    }
}
