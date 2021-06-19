package com.cybertek.tests.day10_webtable_properties_practices;

import com.cybertek.tests.base.TestBase;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.TableUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Table_Tasks extends TestBase {

    @Test
    public void task3_return_tims_due_amount(){

        String url= ConfigurationReader.getProperty("dataTableUrl");
        driver.get(url);
       WebElement timsDueAmountCell= driver.findElement(By.xpath("//table[@id='table1']//td[.='Tim']/../td[4]"));
        System.out.println("timsDueAmountCell = " + timsDueAmountCell.getText());
        String actualTimResult = timsDueAmountCell.getText();
        String expectedTimResult= "$50.00";

        Assert.assertEquals(actualTimResult, expectedTimResult, "Tims cell is failed");





    }

    @Test
    public void task4_verify_order_method(){
        String url= ConfigurationReader.getProperty("dataTableUrl");
        driver.get(url);

        TableUtils.verifyOrder(driver,"Tim");
    }
}
