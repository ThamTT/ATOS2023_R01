package tuanTT.test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;
public class Assignment03 {
    @Test
    public void Ex1() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.walmart.com/account/login");
        driver.manage().window().maximize();
        WebElement email = driver.findElement(By.xpath("//div[@class=\"w_VCAX\"]/input"));
        email.sendKeys("pvtuan2323@gmail.com");
        WebElement clickContinue = driver.findElement(By.className("w_hhLG w_8nsR w_jDfj w-100 mv3"));
        clickContinue.click();
        WebElement fistName = driver.findElement(By.xpath("//input[@name=\"firstName\"]"));
        fistName.sendKeys("Tun");
        WebElement lastName = driver.findElement(By.xpath("//input[@name=\"lastName\"]"));
        lastName.sendKeys("Pham");
        WebElement password = driver.findElement(By.xpath("//input[@name=\"newPassword\"]"));
        password.sendKeys("123456");
        WebElement createAcc = driver.findElement(By.xpath("//button[@name=\"Create Account\"]"));
        createAcc.click();
        driver.close();
    }
    @Test
    public void Ex2(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.walmart.com/ip/VIZIO-70-Class-4K-UHD-LED-SmartCast-Smart-TV-HDR-V-Series-V705-G3/936515428");
        //driver.manage().window().maximize();
        WebElement titleProduct = driver.findElement(By.xpath("//div[@class=\"overflow-hidden\"]/section/h1"));
        String title = titleProduct.getText();
        System.out.println(title);
        WebElement priceProduct = driver.findElement(By.xpath("//span[@class=\"inline-flex flex-column\"]/span"));
        String price = priceProduct.getText();
        System.out.println(price);
        driver.close();
    }
    @Test
    public void Ex3(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.booking.com/index.vi.html?label=gen173nr-1BCAEoggI46AdIM1gEaPQBiAEBmAEquAEXyAEM2AEB6AEBiAIBqAIDuALxrfehBsACAdICJDgzMTRhNDdjLTIwYmYtNGQzNC04ZjM1LWRmNWRjZTQ4YWI5ONgCBeACAQ&sid=4ebddfec0c25997a7592a84126b00cde&keep_landing=1&sb_price_type=total&");
        driver.manage().window().maximize();
        WebElement sigin = driver.findElement(By.className("js-header-login-link"));
        sigin.click();
        WebElement email = driver.findElement(By.className("ZMH9h0HCYH9GGNxHnXGJ"));
        email.sendKeys("pvtuan0311@gmail.com");
        WebElement continueEmail = driver.findElement(By.xpath("//button[@type=\"submit\"]"));
        continueEmail.click();
        driver.close();
    }

    @Test
    public void Ex3_withFacebook(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.booking.com/index.vi.html?label=gen173nr-1BCAEoggI46AdIM1gEaPQBiAEBmAEquAEXyAEM2AEB6AEBiAIBqAIDuALxrfehBsACAdICJDgzMTRhNDdjLTIwYmYtNGQzNC04ZjM1LWRmNWRjZTQ4YWI5ONgCBeACAQ&sid=4ebddfec0c25997a7592a84126b00cde&keep_landing=1&sb_price_type=total&");
        driver.manage().window().maximize();
        WebElement sigin = driver.findElement(By.className("js-header-login-link"));
        sigin.click();
        WebElement facebook = driver.findElement(By.xpath("//a[@class=\"access-panel__social-button access-panel__social-button-facebook bui-button bui-button--secondary nw-social-btn-facebook\"]"));
        facebook.click();
        driver.close();
    }
}
