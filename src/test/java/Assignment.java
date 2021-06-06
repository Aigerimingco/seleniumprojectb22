import com.cybertek.utilities.WebDriverFactory;
import org.openqa.selenium.*;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class Assignment {

    WebDriver driver;

    @BeforeMethod
    public void setupMethod() {

        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.get("https://qa3.vytrack.com/user/login");

    }

    @Test
    public void testing() throws InterruptedException {

        WebElement nameLogin = driver.findElement(By.xpath("//input[@name='_username']"));
        nameLogin.sendKeys("user4");
        WebElement passwordLogin = driver.findElement(By.cssSelector("input[type='password']"));
        passwordLogin.sendKeys("UserUser123" + Keys.ENTER);
        //  Thread.sleep(2000);
        WebElement dropdown = driver.findElement(By.xpath("//li[@class='dropdown dropdown-level-1'][1]"));
        for (WebElement webElement : Arrays.asList(dropdown, driver.findElement(By.xpath("//a[@href='entity/Extend_Entity_Carreservation']")))) {
            webElement.click();
        }
        //  Thread.sleep(3000);
        Thread.sleep(2000);
        WebElement car = driver.findElement(By.xpath("//tr[@class='grid-row row-click-action'][5]"));
        //Thread.sleep(2000);
        car.click();
        Thread.sleep(2000);
        WebElement addEventButton = driver.findElement(By.xpath("//a[@title='Add an event to this record']"));
        addEventButton.click();
        Thread.sleep(2000);
        // addEventButton.sendKeys("jgiyguy");
        Alert x = driver.switchTo().alert();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//div[@class = 'ui-dialog-titlebar-buttonpane']/button")).click();
    }catch (NoSuchElementException e )
    {

    }
    }







