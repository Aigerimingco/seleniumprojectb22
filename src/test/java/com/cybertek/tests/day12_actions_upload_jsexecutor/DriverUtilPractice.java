package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DriverUtilPractice {
    @Test
    public void simple_google_search_test() throws InterruptedException {
        // 1- go to www.google.com
        Driver.getDriver().get(ConfigurationReader.getProperty("googleUrl"));
        // 2-search for a value
        WebElement searchBox= Driver.getDriver().findElement(By.name("q"));
        String searchValue= ConfigurationReader.getProperty("searchValue");
        // send the searchValue and press enter
        searchBox.sendKeys(searchValue+ Keys.ENTER);
        //  3-verify value contained in the title
        String actualTitle= Driver.getDriver().getTitle();
        String expectedInTitle= searchValue;

        Assert.assertTrue(actualTitle.contains(expectedInTitle));

        Driver.closeDriver();

        Thread.sleep(2000);

        Driver.getDriver().get("https://etsy.com/");

        Driver.closeDriver();

    }
}
