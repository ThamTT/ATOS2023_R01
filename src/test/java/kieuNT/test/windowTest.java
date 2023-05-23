package thamTT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class windowTest {
    WebDriver driver;

    @BeforeTest
    public void beforeTest(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver= new ChromeDriver(options);
        driver.get("https://www.selenium.dev/documentation/webdriver/interactions/windows/");
        driver.manage().window().maximize();
    }
    @Test
    public void testWindow(){
        //xac dinh win goc
        String originWin = driver.getWindowHandle();

        //click new window link
        driver.findElement(By.xpath("//a[text() = 'new window']")).click();

        for (String item: driver.getWindowHandles()){
            if(!originWin.contentEquals(item)){
                driver.switchTo().window(item);
                System.out.println(driver.switchTo().window(item).getTitle());
                driver.findElement(By.xpath("(//a[normalize-space(text()) = 'Read more'])[1]")).click();
            }
        }

        //Swich to parent(origin) window
        driver.switchTo().window(originWin);
    }
}
