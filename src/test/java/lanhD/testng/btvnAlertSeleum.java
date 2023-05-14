package lanhD.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.time.Duration;

public class btvnAlertSeleum {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){

        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver= new ChromeDriver(options);
        driver.navigate().to("https://www.tutorialspoint.com/selenium/selenium_automation_practice.htm?fbclid=IwAR11vJ2giA7uolJe4hpfv9blHSM1BZg-2ErLNlEp8PJB8207DCJ5ArAkoFE");
        driver.manage().window().maximize();
    }

    @Test
    public void alertBTVN() throws InterruptedException {
       // WebDriverWait wait= new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement clickFirst =driver.findElement(By.xpath("//input[@name='firstname']"));
        clickFirst.click();
        clickFirst.sendKeys("dinh");


      //  Thread.sleep(Long.parseLong("3000"));

        WebElement clicklast =driver.findElement(By.xpath("//input[@name='lastname']"));
        clicklast.click();
        clicklast.sendKeys("anh");

        WebElement clickMale = driver.findElement(By.xpath("//input[@value='Male']"));
        clickMale.click();
//        WebElement clickFemale = driver.findElement(By.xpath("//input[@value='Female']"));
//        if(clickMale.isSelected()){
//            clickFemale.click();
//        }

        WebElement clickExperience = driver.findElement(By.xpath("//input[@value='5']"));
        clickExperience.click();

        WebElement clickDate= driver.findElement(By.xpath("(//input[@type='text'])[3]"));
       // wait.until(ExpectedConditions.alertIsPresent());
        Thread.sleep(Long.parseLong("3000"));
        clickDate.click();
        clickDate.sendKeys("5");

        WebElement checkboxManual=driver.findElement(By.xpath("//input[@value='Manual Tester']"));
        checkboxManual.click();

//        WebElement checkboxAuto= driver.findElement(By.xpath("//input[@value='Automation Tester']"));
//        if(checkboxManual.isSelected()){
//            checkboxAuto.click();
//        }

        WebElement checkboxselediumIDE= driver.findElement(By.xpath("//input[@value='Selenium IDE']"));
        checkboxselediumIDE.click();

        Select contien= new Select(driver.findElement(By.xpath("//select[@name='continents']")));
        Assert.assertFalse(contien.isMultiple());
        Assert.assertEquals(7,contien.getOptions().size());
        contien.selectByVisibleText("Africa");
        Assert.assertEquals("Africa",contien.getFirstSelectedOption().getText());
        Thread.sleep(Long.parseLong("3000"));

        driver.findElement(By.xpath("//button[text()='Button']")).click();
        driver.switchTo().alert().accept();



        String originwin= driver.getWindowHandle();
        driver.switchTo().window(originwin);








    }


}
