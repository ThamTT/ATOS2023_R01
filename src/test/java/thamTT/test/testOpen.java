package thamTT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class testOpen {
    @Test
    public  void test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
        driver.manage().window().maximize();

       WebElement chxCheckMe = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]/.."));
        chxCheckMe.click();

        WebElement inputChxCheckMe = driver.findElement(By.xpath("(//input[@type=\"checkbox\"])[1]"));
        if (inputChxCheckMe.isSelected()){
            chxCheckMe.click();
        }

        WebElement chxRadioMenu = driver.findElement(By.xpath("//a[normalize-space(text()) = 'Checkboxradio widget']"));
        chxRadioMenu.click();
        WebElement radioMenu = driver.findElement(By.xpath("(//a[normalize-space(text()) = 'Radio buttons'])[1]"));
        radioMenu.click();
        WebElement radioTwo = driver.findElement(By.xpath("//input[@id = 'radio-choice-0b']/.."));
        radioTwo.click();


//        driver.close();
    }
}
