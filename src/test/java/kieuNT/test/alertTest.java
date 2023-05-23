package thamTT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class alertTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){


        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver= new ChromeDriver(options);
        driver.get("http://demo.automationtesting.in/Alerts.html");
        driver.manage().window().maximize();
    }

    @Test
    public void testAlert(){
//            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10))
//            wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//div[@class = 'home-banners']")));
//            driver.findElement(By.xpath("By.xpath(\"//div[@class = 'home-banners']\")")).click();

        driver.findElement(By.xpath("//div[@id= \"OKTab\"]/button")).click();
        String message = driver.switchTo().alert().getText();
        Assert.assertEquals(message, "I am an alert box!", "Not equal");
        driver.switchTo().alert().accept();
    }
    @Test
    public void testAlertOkCancel(){
        driver.findElement(By.xpath("//a[text()= \"Alert with OK & Cancel \"]")).click();
        driver.findElement(By.xpath("//div[@id= \"CancelTab\"]/button")).click();
        String message2 = driver.switchTo().alert().getText();
        Assert.assertEquals(message2, "Press a Button !", "Not equal");
        driver.switchTo().alert().dismiss();
    }
    @Test
    public void testAlert3() throws InterruptedException {

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//div[@class='tab-content']//div[@id='Textbox']/button")).click();
        String message = driver.switchTo().alert().getText();

        wait.until(ExpectedConditions.alertIsPresent());
      //  Thread.sleep(2000);
        driver.switchTo().alert().sendKeys("Kieu");
        driver.switchTo().alert().accept();
        String message3 = driver.findElement(By.xpath("//div[@class='tab-content']//div[@id='Textbox']/p")).getText();
        Assert.assertEquals(message3,"Hello Kieu How are you today");

    }
}
