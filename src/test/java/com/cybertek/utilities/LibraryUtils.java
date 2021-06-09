package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LibraryUtils {

    public static void loginToLibrary(WebDriver driver){
        WebElement inputUsername = driver.findElement(By.xpath("//input[@id='inputEmail']"));
        // Enter username ""
        inputUsername.sendKeys("student11@library");

        // Enter password ""
        WebElement inputPassword = driver.findElement(By.xpath("//input[@id='inputPassword']"));
        inputPassword.sendKeys("tScBPCUr");

        //Click to Login Button
        WebElement loginButton = driver.findElement(By.xpath("//button[text()='Sign in']"));
        loginButton.click();

    }
}
