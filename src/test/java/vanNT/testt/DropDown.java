package vanNT.testt;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class DropDown {
    @Test
    public void DropDown () throws InterruptedException {

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement Cars = driver.findElement(By.id("car-tab"));
        Cars.click();

        Thread.sleep(1500);
        WebElement PickingUp= driver.findElement(By.xpath("//label[text()='Picking up']/..//input"));
        PickingUp.sendKeys("Ho Chi Minh");

        Thread.sleep(1500);
        WebElement DropOff = driver.findElement(By.xpath("//label[text()='Drop-off']/ancestor::div[@class='input-box']//input[@class='form-control']"));
        DropOff.sendKeys("HAN");

        Thread.sleep(1500);
        Select Time1 = new Select(driver.findElement(By.xpath("//label[text()='Picking up']/..//input[@class='form-control']/ancestor::form//select[@class='select-contain-select']")));
        Assert.assertFalse(Time1.isMultiple());
        Assert.assertEquals(48, Time1.getOptions().size());

        Time1.selectByVisibleText("2:30AM");
        Assert.assertEquals("2:30AM", Time1.getFirstSelectedOption().getText());

        Thread.sleep(1500);
        Select Time2 = new Select(driver.findElement(By.xpath("//label[text()='Drop-off']/..//input[@class='form-control']/ancestor::form//select[@class='select-contain-select']")));
        Assert.assertFalse(Time2.isMultiple());
        Assert.assertEquals(48, Time2.getOptions().size());

        Time2.selectByValue("0130AM");
        Assert.assertEquals("1:30AM",Time2.getFirstSelectedOption().getText());

        Thread.sleep(1500);
        WebElement Advan = driver.findElement(By.xpath("//div[@id='car']//div[@class='advanced-wrap']//a"));
        Advan.click();

        Thread.sleep(1500);
        Select CarType = new Select(driver.findElement(By.xpath("(//label[text()='Car type']/../ancestor::div[@id='collapseSix']//select[@class='select-contain-select'])[1]")));
        Assert.assertFalse(CarType.isMultiple());
        Assert.assertEquals(12, CarType.getOptions().size());

        CarType.selectByVisibleText("Premium");
        Assert.assertEquals("Premium", CarType.getFirstSelectedOption().getText());


        Thread.sleep(1500);
        Select RentalCar = new Select(driver.findElement(By.xpath("(//label[text()='Rental car company']/../ancestor::div[@id='collapseSix']//select[@class='select-contain-select'])[2]")));
        Assert.assertFalse(RentalCar.isMultiple());
        Assert.assertEquals(21,  RentalCar.getOptions().size());

        RentalCar.selectByValue("ZL");
        Assert.assertEquals("National Car Rental", RentalCar.getFirstSelectedOption().getText());

        Thread.sleep(1500);
        Select DiscountCode = new Select(driver.findElement(By.xpath("(//label[text()='Discount code']/../ancestor::div[@id='collapseSix']//select[@class='select-contain-select'])[3]")));
        Assert.assertFalse(DiscountCode.isMultiple());
        Assert.assertEquals(3, DiscountCode.getOptions().size());

        DiscountCode.selectByVisibleText("Corporate or contracted");
        Assert.assertEquals("Corporate or contracted", DiscountCode.getFirstSelectedOption().getText());

//        Select coach = new Select(driver.findElement(By.xpath("//div[@id='one-way']//select[@class='select-contain-select']")));
//
//        Assert.assertFalse(coach.isMultiple());
//        Assert.assertEquals(3, coach.getOptions().size());
//
//        coach.selectByVisibleText("Business");
//        Assert.assertEquals("Business", coach.getFirstSelectedOption().getText());

        driver.close();
    }

    @Test
    public void Table() throws InterruptedException {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();

        Thread.sleep(3000);

        WebElement table = driver.findElement(By.id("customers"));

        List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows){
            List<WebElement> cols = row.findElements(By.tagName("td"));
            for (WebElement col:cols){
                System.out.printf("   " + col.getText());
            }
            System.out.printf("\n");
        }
    }



}
