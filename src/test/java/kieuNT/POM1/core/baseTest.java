package kieuNT.POM1.core;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class baseTest {
    protected WebDriver driver;

    @BeforeTest
    public  void beforeTest(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.navigate().to("https://digital-voucher-store-stg.apigate.com/test2");
        driver.manage().window().maximize();

    }
    public WebDriver getDriver(){
        return driver;
    }
    @AfterTest
    public void afterTest(){
//        getDriver().close();
    }

}
