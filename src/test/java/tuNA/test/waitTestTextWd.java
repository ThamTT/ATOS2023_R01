package tuNA.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class waitTestTextWd {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver= new ChromeDriver(options);
        driver.get("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm?fbclid=IwAR2HZly7Tvr3F7LQc7ghG8tnfUyuoyZAZLZLQHQeCOb86nQWT1UTLlbfZHM");
        driver.manage().window().maximize();
    }
    @Test
    public void testInput() throws InterruptedException {
        driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Tu");
        driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Nguyen");
        driver.findElement(By.xpath("//input[@value='Male']")).click();
        driver.findElement(By.xpath("//input[@value='7']")).click();
        driver.findElement(By.xpath("(//input[@type='text'])[3]")).sendKeys("15/11/2001");
        driver.findElement(By.xpath("//span[text()=' Automation Tester ']/input")).click();
        WebElement input = driver.findElement(By.xpath("//span[normalize-space(text())='Selenium Webdriver']/input"));
        //((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView();",input);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");
        Thread.sleep(2000);
        input.click();

        Select continents = new Select(driver.findElement(By.xpath("//select [@name = 'continents']")));
        Assert.assertFalse(continents.isMultiple());
        Assert.assertEquals(7, continents.getOptions().size());
        continents.selectByVisibleText("Europe");
        Assert.assertEquals("Europe", continents.getFirstSelectedOption().getText());

        Select seleniumCommands = new Select(driver.findElement(By.xpath("//select [@name = 'selenium_commands']")));
        Assert.assertEquals(5, seleniumCommands.getOptions().size());
        seleniumCommands.selectByVisibleText("WebElement Commands");
        Assert.assertEquals("WebElement Commands", seleniumCommands.getFirstSelectedOption().getText());
        Thread.sleep(10000);
        driver.findElement(By.xpath("//button[@name='submit']")).click();
        String message2 = driver.switchTo().alert().getText();
        //Assert.assertEquals(message2, "Press a Button !", "Not equal");
        driver.switchTo().alert().accept();
    }
}
