package kieuNT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class BTap0804 {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver= new ChromeDriver(options);
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm#");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }
    @Test
    public void Test() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Kieu");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nguyen");
        driver.findElement(By.xpath("//input[@value = 'Female']")).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='1']")).click();
       // Thread.sleep(3000);
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("11/12/2001");
      //  Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value = 'Automation Tester']")).click();
       // Thread.sleep(5000);
        driver.findElement(By.xpath("//input[@value = 'Selenium Webdriver']")).click();;

        JavascriptExecutor jse1 = (JavascriptExecutor)driver;
        jse1.executeScript("window.scrollBy(0,250)");
        Thread.sleep(5000);

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select [@name = 'continents']")));
        Select continents = new Select(driver.findElement(By.xpath("//select [@name = 'continents']")));
        Assert.assertFalse(continents.isMultiple());
        Assert.assertEquals(7, continents.getOptions().size());
        continents.selectByVisibleText("Europe");
        Assert.assertEquals("Europe", continents.getFirstSelectedOption().getText());

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//select [@name = 'selenium_commands']")));
        Select seleniumCommands = new Select(driver.findElement(By.xpath("//select [@name = 'selenium_commands']")));
        Assert.assertEquals(5, seleniumCommands.getOptions().size());
        seleniumCommands.selectByVisibleText("WebElement Commands");
        Assert.assertEquals("WebElement Commands", seleniumCommands.getFirstSelectedOption().getText());

 //       wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@name = 'submit']")));
        driver.findElement(By.xpath("//button[@name = 'submit']")).click();
        String message = driver.switchTo().alert().getText();
        System.out.println(message);
        Assert.assertEquals(message, "You are submitting information to an external page.\n" +
                "Are you sure?", "Not equal");
        driver.switchTo().alert().accept();

        Thread.sleep(2000);
        String originwin= driver.getWindowHandle();

        driver.switchTo().window(originwin);
    }
}
