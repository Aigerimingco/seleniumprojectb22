package com.cybertek.tests.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {

    public static void main(String[] args) {

        //1-set up the web driver
        WebDriverManager.chromedriver().setup();

        //2- create the instance of the chrome driver
        WebDriver driver= new ChromeDriver();

        //test
        driver.get("https://www.google.com");
    }
}
