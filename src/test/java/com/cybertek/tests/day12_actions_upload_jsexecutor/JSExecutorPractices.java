package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class JSExecutorPractices {

    @Test
    public void scroll_using_jsExecutor_test() {
        //Get the page http://practice.cybertekschool.com/infinite_scroll
        Driver.getDriver().get("http://practice.cybertekschool.com/infinite_scroll");
        BrowserUtils.sleep(2);
        //Down casting our driver type to JSE so we can reach methods in this interface
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();


        //((JavascriptExecutor) Driver.getDriver()).executeScript("");

        //using js we reach executeScript method so we are allowed to pass JS functions
        // this method is capable of accepting JS functions and apply that into our Java-Selenium code
        for (int i = 0; i < 10; i++) {
        BrowserUtils.sleep(1);

            js.executeScript("window.scrollBy(0,750)");

        }
        //this would go 750 pixels up
        js.executeScript("window.scrollBy(0,-750)");
    }

    @Test
    public void scroll_using_jsExecutor_test2(){
        //Go to this page
        Driver.getDriver().get("http://practice.cybertekschool.com/large");

        JavascriptExecutor js= (JavascriptExecutor) Driver.getDriver();

        WebElement CybertekSchoolLink= Driver.getDriver().findElement(By.linkText("Cybertek School"));
        WebElement homeLink= Driver.getDriver().findElement(By.linkText("Home"));

        // use js.executor with different scrolling JS function
        // Scroll down to cybertek school link
        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)",CybertekSchoolLink);

        //scroll up to home link
        BrowserUtils.sleep(1);
        js.executeScript("arguments[0].scrollIntoView(true)",homeLink);

    }
}
