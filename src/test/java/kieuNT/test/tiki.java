package kieuNT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;
public class tiki {
    @Test
    public void Test() throws InterruptedException {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://tiki.vn/");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement checkDoChoi= driver.findElement(By.xpath("(//div[@title='Đồ Chơi - Mẹ & Bé'])/.."));
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkDoChoi);
        Thread.sleep(5000);
        checkDoChoi.click();

        Thread.sleep(3000);
        WebElement cbGiamSau= driver.findElement(By.xpath("(//label[@class='style__CheckboxFake-sc-1ewjwu4-4 eUuyqO'])[4]/.."));
        cbGiamSau.click();
    }
}
