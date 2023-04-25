package vanNT.testt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCKX {
    @Test
    public void TestCKX (){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
        driver.manage().window().maximize();

         WebElement inputCkx = driver.findElement(By.xpath("(//input[@type='checkbox'])[1]/.."));
         inputCkx.click();


        WebElement Agree = driver.findElement(By.xpath("(//label[text()='I agree'])[1]/.."));
        Agree.click();

        WebElement CkxMenu = driver.findElement(By.xpath("//a[normalize-space(text()) = 'Checkboxradio widget']\n"));
        CkxMenu.click();

        WebElement CkxRadio = driver.findElement(By.xpath("(//a[normalize-space(text()) = 'Radio buttons'])[1]"));
        CkxRadio.click();

        //basic

        WebElement CkxOnee = driver.findElement(By.xpath("//input[@id='radio-choice-0a']/.."));
        CkxOnee.click();

        WebElement CkxTwo = driver.findElement(By.xpath("//input[@id='radio-choice-0b']/.."));


        WebElement CkxOneee = driver.findElement(By.xpath("//input[@id='radio-choice-0a']"));
        if (CkxOneee.isSelected())
            CkxTwo.click();


        //minisize

        WebElement rdoOne =driver.findElement(By.xpath("//input[@id='radio-choice-v-6a']/.."));
        rdoOne.click();

        WebElement rdoTwo = driver.findElement(By.xpath("//input[@id='radio-choice-v-6b']/.."));

        WebElement rdoThree = driver.findElement(By.xpath("//input[@id='radio-choice-v-6c']/.."));


        WebElement rdoCheck = driver.findElement(By.xpath("//input[@id='radio-choice-v-6a']"));
        if (rdoCheck.isSelected())
            rdoTwo.click();



        //driver.close();
    }
}
