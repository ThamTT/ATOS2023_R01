package tuanTT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


public class DropDown {
    @Test
    public void Test1(){
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
        driver.manage().window().maximize();
        //driver.findElement(By.xpath("//a[@id=\"package-tab\"]")).click();
        Select coach = new Select(driver.findElement(By.xpath("//div[@id=\"one-way\"]//select[@class=\"select-contain-select\"]")));
        Assert.assertEquals(3,coach.getOptions().size());
        Assert.assertEquals("Economy",coach.getFirstSelectedOption().getText());
        coach.selectByVisibleText("First class");
        Assert.assertEquals("First class",coach.getFirstSelectedOption().getText());
        coach.selectByVisibleText("Business");
        Assert.assertEquals("Business",coach.getFirstSelectedOption().getText());

    }

    @Test
    public void Test2_Car() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[@id=\"car-tab\"]")).click();
        Thread.sleep(2000);
        WebElement txt1 = driver.findElement(By.xpath("//label[text()=\"Picking up\"]/..//input[@class=\"form-control\"]"));
        txt1.sendKeys("LonDon");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//label[text()=\"Drop-off\"]/..//input")).sendKeys("NewYork");

        Select time1 = new Select(driver.findElement(By.xpath("//label[text()=\"Picking up\"]/ancestor::form//label[text()=\"Time\"]/..//select")));
        Assert.assertEquals(48,time1.getOptions().size());
        time1.selectByIndex(13);
        Assert.assertEquals("6:30AM",time1.getFirstSelectedOption().getText());
        Select time2 = new Select(driver.findElement(By.xpath("//label[text()=\"Drop-off\"]/ancestor::form//label[text()=\"Time\"]/..//select")));
        Assert.assertEquals(48,time2.getOptions().size());
        time2.selectByIndex(33);
        Assert.assertEquals("4:30PM",time2.getFirstSelectedOption().getText());
        Thread.sleep(2000);
        WebElement click1 = driver.findElement(By.xpath("//div[@id=\"car\"]/div[@class=\"advanced-wrap\"]/a"));
        click1.click();
//div[@id="flight-car"]//label[text()='Flying from']//..//input
        Thread.sleep(1500);
        Select car_type = new Select(driver.findElement(By.xpath("//label[text()=\"Car type\"]//..//select")));
        Assert.assertEquals(12,car_type.getOptions().size());
        car_type.selectByVisibleText("Luxury");
        Assert.assertEquals("Luxury",car_type.getFirstSelectedOption().getText());

        Thread.sleep(1500);
        Select rental = new Select(driver.findElement(By.xpath("//label[text()=\"Rental car company\"]//..//select")));
        Assert.assertEquals(21,rental.getOptions().size());
        car_type.selectByVisibleText("National Car Rental");
        Assert.assertEquals("National Car Rental",rental.getFirstSelectedOption().getText());

        Thread.sleep(1500);
        Select discount = new Select(driver.findElement(By.xpath("//label[text()=\"Discount code\"]//..//select")));
        Assert.assertEquals(3,discount.getOptions().size());
        car_type.selectByVisibleText("Special or advertised");
        Assert.assertEquals("Special or advertised",discount.getFirstSelectedOption().getText());
    }
}
//*[@id="car"]/div[2]/a