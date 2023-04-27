package vanNT.testt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class Ess3 {
    @Test
    public void Ess3 () {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.walmart.com/account/signup?vid=oaoh&tid=0&returnUrl=%2F");
        driver.manage().window().maximize();

        WebElement firtName = driver.findElement(By.id("ld_ui_textfield_57948"));
        firtName.sendKeys("Nguyễn");

        WebElement lastName = driver.findElement(By.id("text"));
        lastName.sendKeys("Van");

        WebElement createPass = driver.findElement(By.id("ld_ui_textfield_57951"));
        createPass.sendKeys("12345678");

        WebElement checkboxsignedIn = driver.findElement(By.id("ld_checkbox_6244"));
        checkboxsignedIn.click();

        WebElement btnAccount = driver.findElement(By.id("w_hhLG w_8nsR w_jDfj w-100 mt4"));
        btnAccount.click();
        driver.close();


    }
    @Test
    public void Ess3_2 (){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.walmart.com/ip/VIZIO-70-Class-4K-UHD-LED-SmartCast-Smart-TV-HDR-V-Series-V705-G3/936515428");
        driver.manage().window().maximize();

        WebElement TitleProduct = driver.findElement(By.xpath("//div[@class=\"overflow-hidden\"]/section/h1"));
        String Product = TitleProduct.getText();
        System.out.printf(Product);

        WebElement Price = driver.findElement(By.xpath("//div[@class=\"flex fl-m db-m items-baseline\"]/span/span/span"));
        String Pricee = Price.getText();
        System.out.printf(Pricee);

        driver.quit();
    }
    @Test
    public void Ess3_3 () {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://account.booking.com/register?op_token=EgVvYXV0aCL3AgoUdk8xS2Jsazd4WDl0VW4yY3BaTFMSCWF1dGhvcml6ZRo1aHR0cHM6Ly9zZWN1cmUuYm9va2luZy5jb20vbG9naW4uaHRtbD9vcD1vYXV0aF9yZXR1cm4qlgJVczBCX1h5U09ObU9JWHhLN1Z6XzV0TXlST2VkZWVOa3pIS19RR1FOTjROSmNXeHdScEhqUmR3bzc0alc5SXFpTlgtbS1iMWozbXNtb0ZUbW9PNW54Ql9RQ3BzTHRaLUxDVTExVEdIWUItdXF1eVZWM01sUk8tcUYweDFqQVh4ZVJfamFoOFZ0aDJsUU9WaDBheV9mVkdXWmg0RGE4V0x1em5rVTRTRkFmUVFFT0N1dEFxZkFSdzNrcTNpSjNsMmw0dlF1ckVLYVVadjJyVnlPOW9MY09laTJUNVI3RE9RQWRoUnVNQTFRSE1WR01FeXhFWUlRV3R3SXFoT0JsSkZDNHhmcXZmMEowRG5DYkZ1WGJ0S2FRZ0IEY29kZSoWCI7IEjCp-N2NhZ8mOgBCAFjw1v2hBg");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.name("username"));
        username.sendKeys("nguyenthanhvan2116@gmail.com");

        WebElement btnLogin = driver.findElement(By.xpath("//div/button[@class=\"Iiab0gVMeWOd4XcyJGA3 wPxWIS_rJCpwAWksE0s3 Ut3prtt_wDsi7NM_83Jc TuDOVH9WFSdot9jLyXlw EJWUAldA4O1mP0SSFXPm whxYYRnvyHGyGqxO4ici\"]"));
        btnLogin.click();

        WebElement btnFb = driver.findElement(By.xpath("//div/a[@class=\"access-panel__social-button access-panel__social-button-facebook bui-button bui-button--secondary nw-social-btn-facebook\"]"));
        btnFb.click();

        driver.quit();
    }
}
