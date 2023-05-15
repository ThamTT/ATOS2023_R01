package vanNT.testt;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class baitap {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    }

    @Test
    public void testt() throws InterruptedException {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Vân");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nguyễn");
        driver.findElement(By.xpath("//input[@value='Female']")).click();
        driver.findElement(By.xpath("//input[@value='3']")).click();
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,300)");


        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("09/08/2021");
        driver.findElement(By.xpath("//input[@value='Automation Tester']")).click();
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@value='Selenium IDE']")).click();

        Thread.sleep(3000);

        Select continents = new Select(driver.findElement(By.xpath("//select[@name='continents']")));
        Assert.assertFalse(continents.isMultiple());
        Assert.assertEquals(7, continents.getOptions().size());

        continents.selectByVisibleText("South America");
        Assert.assertEquals("South America", continents.getFirstSelectedOption().getText());

        Thread.sleep(3000);

        Select commands = new Select(driver.findElement(By.xpath("//select[@name='selenium_commands']")));
        Assert.assertEquals(5,commands.getOptions().size());
        commands.selectByVisibleText("Switch Commands");
        Assert.assertEquals("Switch Commands", commands.getFirstSelectedOption().getText());

        Thread.sleep(2000);
        driver.findElement(By.xpath("//button[@name='submit']")).click();







    }
}