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
        driver.get("https://www.google.com/");
        driver.manage().window().maximize();
        WebElement inputKey = driver.findElement(By.xpath("//textarea[@class='gLFyf']"));
        inputKey.sendKeys("abc");
        Actions action = new Actions(driver);
        action.sendKeys(Keys.ENTER).perform();

    }
    @Test
    public void test2() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.navigate().to("https://anhtester.com/");
        driver.manage().window().maximize();
        Actions actions = new Actions(driver);

        WebElement doubleClickAuto = driver.findElement(By.xpath("//div[@class='col-lg-7']//h2"));
        actions.doubleClick(doubleClickAuto).build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(3000);
        WebElement clickSearch = driver.findElement(By.xpath("//div[@class='menu-wrapper']//input"));
        clickSearch.click();

        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();

    }
}
