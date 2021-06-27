package com.cybertek.tests.day14_pom_synchronization;

import com.cybertek.pages.DynamicLoad7Page;
import com.cybertek.utilities.BrowserUtils;
import com.cybertek.utilities.Driver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

public class WebDriverWaitPractice {

    @Test
    public void dynamic_loading_7_test() {
        DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

//        TC#40 : Dynamically Loaded Page Elements 7
//        1. Go to http://practice.cybertekschool.com/dynamic_loading/7

        Driver.getDriver().get("http://practice.cybertekschool.com/dynamic_loading/7");
//        2. Wait until title is “Dynamic title”
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.titleIs("Dynamic title"));

       // DynamicLoad7Page dynamicLoad7Page = new DynamicLoad7Page();

        //        3. Assert : Message “Done” is displayed.
        Assert.assertTrue(dynamicLoad7Page.doneMessage.isDisplayed());
//        4. Assert : Image is displayed
        BrowserUtils.sleep(2);
        Assert.assertTrue(dynamicLoad7Page.spongeBobImage.isDisplayed());
    }

}
