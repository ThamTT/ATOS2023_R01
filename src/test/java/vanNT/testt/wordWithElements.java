package vanNT.testt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class wordWithElements {
    @Test
    public void wordWithElements (){
        
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("Tran Tham");
        WebElement pass = driver.findElement(By.id("password"));
        pass.sendKeys("abcd");
        WebElement btnSignIn = driver.findElement(By.id("log-in"));
        btnSignIn.click();

        WebElement txtHeader = driver.findElement(By.id("time"));
        String actual = txtHeader.getText();
        System.out.printf("text = "+actual);

        //driver.close();




    }
}
