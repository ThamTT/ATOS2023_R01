package kieuNT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.swing.*;

public class actionclass {
    WebDriver driver;
    @BeforeTest
    public void beforeTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }

    @Test
    public void sendKeyBoard() {

        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement inputSearch = driver.findElement(By.xpath("//textarea[@name=\"q\"]"));
        inputSearch.sendKeys("automation");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }
    @Test
    public void doubleClick(){
        driver.navigate().to("https://anhtester.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement title = driver.findElement(By.xpath("//div[@class = 'col-lg-7']//h2"));
        actions.doubleClick(title).build().perform();

        WebElement webTesting = driver.findElement(By.xpath("//h3[text() = 'Website Testing']"));
        actions.contextClick(webTesting).build().perform();

        WebElement courseMenu = driver.findElement(By.id("categories"));
        actions.moveToElement(courseMenu).build().perform();

        WebElement allCourse = driver.findElement(By.xpath("//a[normalize-space(text()) = 'All Courses']"));
        allCourse.click();
        actions.keyUp(Keys.CONTROL).sendKeys(Keys.END).build().perform();

    }
    @Test
    public void copyPaste() throws InterruptedException {
        driver.navigate().to("https://anhtester.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);
        WebElement copyTitle = driver.findElement(By.xpath("//div[@class = 'col-lg-7']//h2"));
        actions.doubleClick(copyTitle).build().perform();
        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
        Thread.sleep(3000);

        WebElement pasteTitle = driver.findElement(By.xpath("//input[@placeholder= \"Tìm kiếm khóa học . . .\"]"));
        pasteTitle.click();
        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
        actions.sendKeys(Keys.ENTER).build().perform();
    }
}
