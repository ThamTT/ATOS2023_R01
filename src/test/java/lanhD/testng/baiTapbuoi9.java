package lanhD.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class baiTapbuoi9 {
    @Test
    public void test(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demo.applitools.com/");

        WebElement username = driver.findElement(By.id("username"));
        username.sendKeys("lan anh");
//        WebElement us = driver.findElement(By.xpath("//input[@class='form-control']"));
//        us.sendKeys("ngan");
//        WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
//        password.sendKeys("ngan");
        WebElement password = driver.findElement(By.xpath("//input[@placeholder='Enter your password']"));
        password.sendKeys("ngan");
        WebElement signIn = driver.findElement(By.id("log-in"));
        signIn.click();


        //    WebElement txtheader1= driver.findElement(By.id(""))
        WebElement txtHeader2 = driver.findElement(By.xpath("//div[@class='logged-user-name']"));
        String actualName = txtHeader2.getText();
        Assert.assertEquals(actualName.trim(),"Jack Gomez");
        //  System.out.println(" "+actual);



    }
}
