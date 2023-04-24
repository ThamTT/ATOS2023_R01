package thamTT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Buoi5 {
    @Test
    public void main() throws InterruptedException {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://tiki.vn/");
        driver.manage().window().maximize();

        WebElement checkMeBe= driver.findElement(By.xpath("(//div[@title='Đồ Chơi - Mẹ & Bé'])/.."));
        checkMeBe.click();
        Thread.sleep(3000);
        WebElement checkBoxGiamSau= driver.findElement(By.xpath("(//label[@class='style__CheckboxFake-sc-1ewjwu4-4 eUuyqO'])[4]/.."));
    }
}
