package tuanTT.test;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TiKi {
    @Test
    public void TiKi_CheckBook() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://tiki.vn/");
        driver.manage().window().maximize();
        //driver.manage().window().
        WebElement ab = driver.findElement(By.xpath("//div[text()=\"Đồ Chơi - Mẹ & Bé\"]"));
        ab.click();
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, 200)");
        Thread.sleep(4000);
        WebElement cb_TraGop = driver.findElement(By.xpath("//h4[text()=\"Dịch vụ\"]/../label[3]/label/span"));
        if(!cb_TraGop.isSelected()){
            driver.findElement(By.xpath("//h4[text()=\"Dịch vụ\"]/../label[3]/label/span/..")).click();
        }
        Thread.sleep(4000);
        WebElement btn_TraGop = driver.findElement(By.xpath("//div[@class=\"filter-items\"]/p[3]"));
        String txt = btn_TraGop.getText();
        System.out.println(txt);
        assertEquals("Trả góp 0%",txt);
    }
}
