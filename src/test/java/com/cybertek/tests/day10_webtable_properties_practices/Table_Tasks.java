package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TableUtils;
import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class Table_Tasks {
    WebDriver driver;
    @BeforeMethod
    public void setupMethod(){
        String browser= ConfigurationReader.getProperty("browser");
        // this line returns string chrome

        String url= ConfigurationReader.getProperty("dataTableUrl");

        driver = WebDriverFactory.getDriver(browser);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get(url);
        // below code same as above
        //driver.get(ConfigurationReader.getProperty("dataTableUrl"));

    }
    @Test
    public void task3_return_tims_due_amount(){
       WebElement timsDueAmountCell= driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));
        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());
        String actualTimResult = timsDueAmountCell.getText();
        String expectedTimResult= "$50.00";

        Assert.assertEquals(actualTimResult, expectedTimResult, "Tims cell is failed");





    }

    @Test
    public void task4_verify_order_method(){

        TableUtils.verifyOrder(driver,"Tim");
    }
}
