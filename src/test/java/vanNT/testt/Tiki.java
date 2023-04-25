package vanNT.testt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class Tiki {
    @Test
    public void Tiki(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://tiki.vn/");
        driver.manage().window().maximize();

        WebElement btnMebe = driver.findElement(By.xpath("//a[@title='Đồ Chơi - Mẹ & Bé']"));
        btnMebe.click();

        WebElement ckxGiamsau = driver.findElement(By.xpath("//span[text()='Giảm sâu']/../.."));
        ckxGiamsau.click();


        driver.close();



    }

}
