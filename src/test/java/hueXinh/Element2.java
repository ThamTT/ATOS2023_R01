package hueXinh;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Element2 {
    @Test
    public void main(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
        driver.manage().window().maximize();

//        Select coach = new Select(driver.findElement(By.xpath("//div[@id = 'one-way']//select [@class = 'select-contain-select']")));
//       // Assert.assertEquals(3,coach.getOptions().);
//
//        coach.selectByVisibleText("Business");
//        Assert.assertEquals("Business", coach.getFirstSelectedOption().getText());
//
//        coach.selectByValue("3");
//        Assert.assertEquals("First class", coach.getFirstSelectedOption().getText());
        driver.findElement(By.id("cruise-tab")).click();
        Select coach2= new Select(driver.findElement(By.xpath("//div[@id='cruise']//select[@class='select-contain-select']")));
        coach2.selectByVisibleText("Alaska");
        Assert.assertEquals("Alaska", coach2.getFirstSelectedOption().getText());


    }
}
