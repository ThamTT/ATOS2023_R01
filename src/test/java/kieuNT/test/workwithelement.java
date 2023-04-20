package kieuNT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class workwithelement {
    @Test
    public void Test(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.applitools.com/");
        driver.manage().window().maximize();

        WebElement username= driver.findElement(By.id("username"));
        username.sendKeys("Nguyen Kieu");
        WebElement password= driver.findElement(By.xpath("//input[@id='password']"));
        password.sendKeys("123456");
        WebElement btnSignIn= driver.findElement(By.xpath("//a[@id ='log-in']"));
        btnSignIn.click();

        WebElement txtHeader = driver.findElement(By.id("time"));
        String actual = txtHeader.getText();

        System.out.println(actual);

        Assert.assertEquals(actual, "Your nearest branch closes in: 30m 5s");
        WebElement txtName = driver.findElement(By.className("logged-user-name"));
        String actualName = txtName.getText();
        Assert.assertEquals(actualName.trim(),"Jack Gomez");

         driver.close();//dong trinh duyet hien tai
       //  driver.quit();//dong tat ca cac trinh duyet

    }
}
