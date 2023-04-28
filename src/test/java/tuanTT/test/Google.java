package tuanTT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import javax.swing.*;
import java.security.Key;

public class Google {
    @Test
    public void test1(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
        driver.manage().window().maximize();
        WebElement inputKey = driver.findElement(By.xpath());
        inputKey.sendKeys("abc");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();

    }
    public void test2(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://anhtester.com/");
        driver.manage().window().maximize();
        WebElement title = driver.findElement(By.xpath(""));

        Actions action = new Actions(driver);
        action.doubleClick().build().perform();
        WebElement web = driver.findElement(By.xpath(""));
        action.contextClick(web).build().perform();

        action.moveToElement(eb).build().perform();
    }
}
