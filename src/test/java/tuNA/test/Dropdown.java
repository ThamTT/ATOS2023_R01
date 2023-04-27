package tuNA.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Dropdown {
    @Test
    public void Ex1() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
        driver.manage().window().maximize();
        Select coach = new Select(driver.findElement(By.xpath("//div[@id = 'one-way']//select [@class = 'select-contain-select']")));

        Assert.assertFalse(coach.isMultiple());
        Assert.assertEquals(3, coach.getOptions().size());

        coach.selectByVisibleText("Business");
        Assert.assertEquals("Business", coach.getFirstSelectedOption().getText());

        coach.selectByValue("3");
        Assert.assertEquals("First class", coach.getFirstSelectedOption().getText());
        Thread.sleep(3000);

        WebElement Cruises = driver.findElement(By.xpath("//a[@id='cruise-tab']"));
        Cruises.click();
        Thread.sleep(2000);
        WebElement click = driver.findElement(By.xpath("(//button[@type= 'button'])[23]/.."));
        click.click();
        Select goingTo = new Select(driver.findElement(By.xpath("//div[@id = 'cruise']//select [@class = 'select-contain-select']")));

        Assert.assertFalse(goingTo.isMultiple());
        Assert.assertEquals(26, goingTo.getOptions().size());
        goingTo.selectByVisibleText("Caribbean");
        Assert.assertEquals("Caribbean", goingTo.getFirstSelectedOption().getText());
        Thread.sleep(2000);

        WebElement Cars = driver.findElement(By.id("car-tab"));
        Cars.click();
        Thread.sleep(2000);
        WebElement pickingUp = driver.findElement(By.xpath("(//div[@class= 'form-group'])[37]/input"));
        pickingUp.sendKeys("BG");
        WebElement dropOff = driver.findElement(By.xpath("(//div[@class= 'form-group'])[40]/input"));
        dropOff.sendKeys("ABCD");

        Select timeUp = new Select(driver.findElement(By.xpath("(//div[@id = 'car']//select [@class = 'select-contain-select'])[1]")));
        Assert.assertFalse(timeUp.isMultiple());
        Assert.assertEquals(48, timeUp.getOptions().size());
        timeUp.selectByValue("1230AM");
        Assert.assertEquals("12:30AM", timeUp.getFirstSelectedOption().getText());

        Select timeOff = new Select(driver.findElement(By.xpath("(//div[@id = 'car']//select [@class = 'select-contain-select'])[2]")));
        Assert.assertFalse(timeOff.isMultiple());
        Assert.assertEquals(48, timeOff.getOptions().size());
        timeOff.selectByValue("0100AM");
        Assert.assertEquals("1:00AM", timeOff.getFirstSelectedOption().getText());

        Thread.sleep(2000);
        WebElement advancedOptions = driver.findElement(By.xpath("(//a[normalize-space(text()) = 'Advanced options'])[2]"));
        advancedOptions.click();
        Select carType = new Select(driver.findElement(By.xpath("(//div[@id = 'collapseSix']//select [@class = 'select-contain-select'])[1]")));
        Assert.assertFalse(carType.isMultiple());
        Assert.assertEquals(12, carType.getOptions().size());
        carType.selectByValue("2");
        Assert.assertEquals("Economy", carType.getFirstSelectedOption().getText());

        Select rentalCarCompany = new Select(driver.findElement(By.xpath("(//div[@id = 'collapseSix']//select [@class = 'select-contain-select'])[2]")));
        Assert.assertFalse(rentalCarCompany.isMultiple());
        Assert.assertEquals(21, rentalCarCompany.getOptions().size());
        rentalCarCompany.selectByValue("AD");
        Assert.assertEquals("Advantage Rent-A-Car", rentalCarCompany.getFirstSelectedOption().getText());

        Select discountCode = new Select(driver.findElement(By.xpath("(//div[@id = 'collapseSix']//select [@class = 'select-contain-select'])[3]")));
        Assert.assertFalse(discountCode.isMultiple());
        Assert.assertEquals(3, discountCode.getOptions().size());
        discountCode.selectByValue("1");
        Assert.assertEquals("Corporate or contracted", discountCode.getFirstSelectedOption().getText());
    }
}
