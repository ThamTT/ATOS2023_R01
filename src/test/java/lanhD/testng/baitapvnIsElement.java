package lanhD.testng;

import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class baitapvnIsElement {
    @Test
    public void test() throws InterruptedException {
        ChromeOptions options =new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.navigate().to("https://anhtester.com/");
        driver.manage().window().maximize();

        Actions actions=new Actions(driver);
        WebElement doubleClickAuto = driver.findElement(By.xpath("//div[@class='col-lg-7']//h2"));
        actions.doubleClick(doubleClickAuto).build().perform();

        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(3000);

        WebElement clickTimKiem = driver.findElement(By.xpath("//div[@class='form-group']"));
        clickTimKiem.click();

        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        actions.sendKeys(Keys.ENTER).perform();





    }
}
