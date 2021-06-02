package com.cybertek.tests.day6_testing_intro_dropdowns;

import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import java.util.List;

import java.util.concurrent.TimeUnit;

public class P03_Apple_Task {
    public static void main(String[] args) throws InterruptedException {
        /**
         * TC #03: FINDELEMENTS_APPLE
         */
         //1. Open Chrome browser
        WebDriver driver= WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
         // 2. Go to https://www.apple.com/
        driver.get("https://www.apple.com/");
         //3. Click to all of the headers one by one
        List<WebElement> headerLinks= driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));

        for (int eachLink = 1; eachLink < headerLinks.size()-1; eachLink++) {
            //a. Mac, iPad, iPhone, Watch, TV, Music, Support
            // System.out.println(headerLinks.get(eachLink).getText());
            //Thread.sleep(2000);
            headerLinks.get(eachLink).click();
            headerLinks = driver.findElements(By.xpath("//ul[@class='ac-gn-list']//li/a"));
            //4. Print out the titles of the each page

            System.out.println("Current title in the page " + driver.getTitle());

            //5. Print out total number of links in each page
            List<WebElement> allLinks = driver.findElements(By.xpath("//body//a"));
            System.out.println("Total number of links in current page " + allLinks);

            int linkswithnotext=0;
            int linkswithtext=0;
            for (WebElement each:allLinks) {
                if(each.getText().isEmpty()){
                    linkswithnotext++;
                }else{
                    linkswithtext++;

                    System.out.println(linkswithnotext);
                    System.out.println(linkswithtext);
                }

            }

        }

         //6. While in each page:
         //a. Print out how many link is missing text TOTAL
         // b. Print out how many link has text TOTAL

    }
}
