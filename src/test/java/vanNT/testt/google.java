package vanNT.testt;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class google {

    WebDriver  driver;

    @BeforeTest
    public void beforTest(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
    }
    @Test
    public void google(){
        driver.navigate().to("https://www.google.com/");
        driver.manage().window().maximize();

        WebElement inputSearch = driver.findElement(By.xpath("//textarea[@name='q']"));
        inputSearch.sendKeys("automattion");

        Actions actions = new Actions(driver);
        actions.sendKeys(Keys.ENTER).perform();
    }

    @Test
    public void doubleClick () throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.navigate().to("https://anhtester.com/");
        driver.manage().window().maximize();

        Actions actions = new Actions(driver);


        WebElement doubleClick = driver.findElement(By.xpath("//div[@class='section-heading']//p"));

        actions.doubleClick(doubleClick).build().perform();
        actions.keyDown(Keys.COMMAND).sendKeys("c").keyUp(Keys.COMMAND).build().perform();

        Thread.sleep(3000);

        WebElement paste = driver.findElement(By.xpath("//div[@class='menu-wrapper']//input"));
        actions.keyDown(Keys.COMMAND).sendKeys("v").keyUp(Keys.COMMAND).build().perform();
        actions.sendKeys(Keys.ENTER).perform();
        driver.close();
    }}











////        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
//        actions.keyDown(Keys.COMMAND).sendKeys(doubleClick, "a").keyUp(Keys.COMMAND).build().perform();
//// Sử dụng phím Ctrl + C để sao chép văn bản đã chọn vào clipboard
//        actions.sendKeys(Keys.COMMAND, "c").perform();
//
//        WebElement paste = driver.findElement(By.xpath("//div[@class='menu-wrapper']//input"));
//        actions.click(paste).perform();
//        actions.keyDown(Keys.COMMAND).sendKeys( "v").keyUp(Keys.COMMAND).build().perform();
//
////        actions.keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
//
//        actions.sendKeys(Keys.ENTER);


//        WebElement Wtes = driver.findElement(By.xpath("//h3[text()='Website Testing']"));
//        actions.contextClick(Wtes).build().perform();
//
//        WebElement mov = driver.findElement(By.id("categories"));
//        actions.moveToElement(mov).build().perform();
//        WebElement All = driver.findElement(By.xpath("//