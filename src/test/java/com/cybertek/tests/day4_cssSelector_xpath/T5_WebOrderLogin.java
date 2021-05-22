package com.cybertek.tests.day4_cssSelector_xpath;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class T5_WebOrderLogin {
    public static void main(String[] args) throws InterruptedException {
        /**
         TC #5: Basic login authentication
         1- Open a chrome browser
         2- Go to:
         http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx
         3- Verify title equals:
         Expected: Web Orders Login
         4- Enter username: Tester
         5- Enter password: test
         6- Click “Sign In” button
         7- Verify title equals:
         Expected: Web Orders
         */
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://secure.smartbearsoftware.com/samples/testcomplete12/WebOrders/login.aspx");

        String expectedTitle="Web Orders Login";
        String actualTitle= driver.getTitle();
        if(actualTitle.equals(expectedTitle)){
            System.out.println("Passed!");
        }else{
            System.out.println("Failed!");
        }

        WebElement inputUsername= driver.findElement(By.id("ctl00_MainContent_username"));
        inputUsername.sendKeys("Tester");
        WebElement iputPassword= driver.findElement(By.id("ctl00_MainContent_password"));
        iputPassword.sendKeys("test");
        inputUsername.sendKeys(Keys.ENTER);

        WebElement loginButton= driver.findElement(By.id("ctl00_MainContent_login_button"));
        loginButton.click();

        String titleAfterLogin= "Web Orders";
        String actualHomePageTitle=driver.getTitle();
        if(actualHomePageTitle.equals(titleAfterLogin)){
            System.out.println("Home page Title passed!");
        }else{
            System.out.println("Home page Title failed!");
        }

        Thread.sleep(3000);
        driver.close();


    }
}
