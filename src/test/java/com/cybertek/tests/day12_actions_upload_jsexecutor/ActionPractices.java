package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ActionPractices {
    @Test
    public void tc15_actions_hoverPractice(){
        //TC #15: Hover Test
        //1.Go to http://practice.cybertekschool.com/hovers
        Driver.getDriver().get("http://practice.cybertekschool.com/hovers");
        //locating all images here:
        WebElement img1= Driver.getDriver().findElement(By.xpath("(//img)[1]"));
        WebElement img2= Driver.getDriver().findElement(By.xpath("(//img)[2]"));
        WebElement img3= Driver.getDriver().findElement(By.xpath("(//img)[3]"));

        // locating all the user texts
        WebElement user1= Driver.getDriver().findElement(By.xpath("//h5[.='name: user1']"));
        WebElement user2= Driver.getDriver().findElement(By.xpath("//h5[.='name: user2']"));
        WebElement user3= Driver.getDriver().findElement(By.xpath("//h5[.='name: user3']"));

        // We must create object of Actions class to be able to use methods coming from there
        BrowserUtils.sleep(2);
        Actions actions = new Actions(Driver.getDriver());


        // 2.Hover over to first image
        actions.moveToElement(img1).perform();
        // 3.Assert: a.“name: user1” is displayed
        Assert.assertTrue(user1.isDisplayed());
        BrowserUtils.sleep(1);

        // 4.Hover over to second image
        actions.moveToElement(img2).perform();
        // 5.Assert: a.“name: user2” is displayed
        Assert.assertTrue(user2.isDisplayed());


        // 6.Hover over to third image
        actions.moveToElement(img3).perform();
        // 7.Confirm: a.“name: user3” is displayed
        Assert.assertTrue(user3.isDisplayed());


    }
}
