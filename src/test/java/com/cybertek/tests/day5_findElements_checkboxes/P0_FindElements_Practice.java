package com.cybertek.tests.day5_findElements_checkboxes;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;
import java.util.concurrent.TimeUnit;

public class P0_FindElements_Practice {
    public static void main(String[] args) {


    /*
    TC #0: FINDELEMENTS
    */
        //1. Open Chrome browser
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();

        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        //2. Go to http://practice.cybertekschool.com/forgot_password
        driver.get("http://practice.cybertekschool.com/forgot_password");
        
        // WE NEED TO CREATE A LOCATOR THAT RETURNS US ALL THE LINKS ON THE PAGE
        List<WebElement> listofLinks= driver.findElements(By.xpath("//body//a"));
        //3. Print out the texts of all links
        for (WebElement each : listofLinks) {
            System.out.println("each = " + each.getText());
            System.out.println(each.getAttribute("href"));
        }
        //4. Print out how many total link
        //System.out.println(listofLinks.size());
        
        int numofLinks= listofLinks.size();
        System.out.println("numofLinks = " + numofLinks);

    }
}