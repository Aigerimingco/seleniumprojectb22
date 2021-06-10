package com.cybertek.utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.List;

public class TableUtils {

    public static void verifyOrder(WebDriver driver, String name) {
        //locate all the names from table and store them in a list of WebElements
        List<WebElement> allNames = driver.findElements(By.xpath("//table[@id='table1']//tr/td[2]"));

        for (WebElement each : allNames) {
            if(each.getText().equals(name)){
                Assert.assertTrue(true);
                return;
            }
        }
        //Assert.fail();
        Assert.assertTrue(false,"Nmae does not exist in the list");
    }
}
