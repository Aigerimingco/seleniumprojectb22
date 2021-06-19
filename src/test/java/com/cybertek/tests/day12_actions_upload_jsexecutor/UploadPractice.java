package com.cybertek.tests.day12_actions_upload_jsexecutor;

import com.cybertek.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UploadPractice {
    //TC #14: UploadTest1.
   // Go to http://practice.cybertekschool.com/upload
    @Test
    public void uploadTest() {
        Driver.getDriver().get("http://practice.cybertekschool.com/upload");

        // 2.Find some small file from your computer, and get the path of it.
        String path= "/Users/aigerimingco/Downloads/message-5.txt";
        WebElement chooseFile= Driver.getDriver().findElement(By.id("file-upload"));
        WebElement uploadButton = Driver.getDriver().findElement(By.id("file-submit"));

        // 3.Upload the file.
        chooseFile.sendKeys(path);

        uploadButton.click();

        // 4.Assert:
        // -File uploaded text is displayed on the page
        WebElement uploadedMessage= Driver.getDriver().findElement(By.tagName("h3"));
        Assert.assertTrue(uploadedMessage.isDisplayed());

        Driver.closeDriver();
    }

}
