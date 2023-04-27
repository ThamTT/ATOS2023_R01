package kieuNT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dropdownCars {
    @Test
    public void Test() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        WebElement checkCars = driver.findElement(By.xpath("//a[@id = \"car-tab\"]/.."));
        checkCars.click();
        Thread.sleep(3000);

        WebElement pickingUp = driver.findElement(By.xpath("//input[@placeholder = \"City, airport or address\"]"));
        pickingUp.sendKeys("Thai Nguyen");
        WebElement dropOff = driver.findElement(By.xpath("//input[@placeholder = \"Same as pick-up\"]"));
        dropOff.sendKeys("Ha Giang");

        Select timeUp = new Select(driver.findElement(By.xpath("(//div[@id = 'car']//select [@class = 'select-contain-select'])[1]")));
        Assert.assertFalse(timeUp.isMultiple());
        Assert.assertEquals(48, timeUp.getOptions().size());
        timeUp.selectByVisibleText("5:00AM");
        Assert.assertEquals("5:00AM", timeUp.getFirstSelectedOption().getText());

        Select timeOff = new Select(driver.findElement(By.xpath("(//div[@id = 'car']//select [@class = 'select-contain-select'])[2]")));
        Assert.assertFalse(timeOff.isMultiple());
        Assert.assertEquals(48, timeOff.getOptions().size());
        timeOff.selectByVisibleText("12:00PM");
        Assert.assertEquals("12:00PM", timeOff.getFirstSelectedOption().getText());



        WebElement checkAdvanced = driver.findElement(By.xpath("(//a[normalize-space(text()) = 'Advanced options'])[2]"));
       // ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", checkAdvanced);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("window.scrollBy(0,250)");

        Thread.sleep(5000);
        checkAdvanced.click();

        Select carType = new Select(driver.findElement(By.xpath("(//div[@id =\"collapseSix\"]//select[@class = \"select-contain-select\"])[1]")));
        Assert.assertFalse(carType.isMultiple());
        Assert.assertEquals(12, carType.getOptions().size());

        carType.selectByVisibleText("Economy");
        Assert.assertEquals("Economy",carType.getFirstSelectedOption().getText());

        Select rentalCarCompany = new Select(driver.findElement(By.xpath("(//div[@id =\"collapseSix\"]//select[@class = \"select-contain-select\"])[2]")));
        Assert.assertFalse(rentalCarCompany.isMultiple());
        Assert.assertEquals(21, rentalCarCompany.getOptions().size());

        rentalCarCompany.selectByVisibleText("Dollar Rent A Car");
        Assert.assertEquals("Dollar Rent A Car",rentalCarCompany.getFirstSelectedOption().getText());

        Thread.sleep(2000);
        Select discoutCode = new Select(driver.findElement(By.xpath("(//div[@id =\"collapseSix\"]//select[@class = \"select-contain-select\"])[3]")));
        Assert.assertFalse(discoutCode.isMultiple());
        Assert.assertEquals(3, discoutCode.getOptions().size());

        discoutCode.selectByVisibleText("Corporate or contracted");
        Assert.assertEquals("Corporate or contracted",discoutCode.getFirstSelectedOption().getText());

    }
}
