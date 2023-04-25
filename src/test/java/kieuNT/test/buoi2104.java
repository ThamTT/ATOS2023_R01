package kieuNT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class buoi2104 {
    @Test
    public void Test() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
        driver.manage().window().maximize();

        WebElement chxMe = driver.findElement(By.xpath("(//input[@type= 'checkbox'])[1]/.."));
        chxMe.click();

        WebElement cbIAgree = driver.findElement(By.xpath("(//input[@type = 'checkbox'])[2]/.."));
        cbIAgree.click();

        WebElement inputChxCheckMe = driver.findElement(By.xpath("(//input[@type= 'checkbox'])[1]"));

        if( inputChxCheckMe.isSelected()){
            chxMe.click();
        }

        WebElement cbCheckboxRadio = driver.findElement(By.xpath("//a[normalize-space(text()) = 'Checkboxradio widget']"));
        cbCheckboxRadio.click();
        WebElement radioButton = driver.findElement(By.xpath("(//a[normalize-space(text()) = 'Radio buttons'])[1]"));
        radioButton.click();

        WebElement rdOne = driver.findElement(By.xpath("(//input[@type = 'radio'])[1]//.."));
        rdOne.click();

        WebElement rdTwo = driver.findElement(By.xpath("(//input[@type = 'radio'])[2]//.."));

        WebElement rdoOne = driver.findElement(By.xpath("(//input[@type = 'radio'])[1]"));
        if(rdoOne.isSelected()){
            rdTwo.click();
        }
    }
}
