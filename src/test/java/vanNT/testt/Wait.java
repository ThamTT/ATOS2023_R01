package vanNT.testt;

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

public class Wait {
    WebDriver driver;

    @BeforeTest
    public void beforeTest() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
        driver.manage().window().maximize();
    }

    @Test
    public void Win(){
        String win = driver.getWindowHandle();

        driver.findElement(By.xpath("//a[text()='new window']")).click();
        for (String item: driver.getWindowHandles()){
            if(win.contentEquals(item)){
                driver.switchTo().window(item);
                System.out.println(driver.switchTo().window(item).getTitle());
                driver.findElement(By.xpath("(//a[normalize-space(text())='Read more'])[1]")).click();
            }

        }

        driver.switchTo().window(win);
    }



     @Test
    public void alert (){
        driver.findElement(By.xpath("//div[@id='OKTab']/button")).click();
        String message = driver.switchTo().alert().getText();
        Assert.assertEquals(message, "I am an alert box!","Not equal");
        driver.switchTo().alert().accept();
     }

     @Test
    public void alert1(){
        driver.findElement(By.xpath("//a[text()='Alert with OK & Cancel ']/..")).click();
        driver.findElement(By.xpath("//div[@id='CancelTab']/button")).click();
        String message1 = driver.switchTo().alert().getText();
        Assert.assertEquals(message1, "Press a Button !","Not equal ");
        driver.switchTo().alert().dismiss();
     }

     @Test
    public void alert2(){
         WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(By.xpath("//a[text()='Alert with Textbox ']")).click();
        driver.findElement(By.xpath("//div[@id='Textbox']/button")).click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().sendKeys("Thanh Van");
        driver.switchTo().alert().accept();
        String message2 = driver.findElement(By.xpath("//p[@id='demo1']")).getText();
        Assert.assertEquals(message2, "Hello Thanh Van How are you today","Not equal");
     }


}
