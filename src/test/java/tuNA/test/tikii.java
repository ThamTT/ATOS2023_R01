package tuNA.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class tikii {
    @Test
    public void Ex1() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://tiki.vn/");
        driver.manage().window().maximize();
        WebElement doChoi = driver.findElement(By.xpath("//div[@title=\"Đồ Chơi - Mẹ & Bé\"]/.."));
        doChoi.click();
        Thread.sleep(3000);
        WebElement traGop = driver.findElement(By.xpath("//span[text() = 'Trả góp 0%']/ancestor::label"));
        //WebElement traGop = driver.findElement(By.xpath("(//img[@class=\"icon-check-off\"])[3]/../../.."));
        //traGop.click();
        WebElement inputTraGop = driver.findElement(By.xpath("//span[text() = 'Trả góp 0%']/ancestor::label/input"));
        if (!inputTraGop.isSelected()){
            traGop.click();
        }
    }
}
