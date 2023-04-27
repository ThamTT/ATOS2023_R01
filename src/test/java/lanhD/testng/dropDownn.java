package lanhD.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dropDownn {
    @Test
    public void dropdownnn() throws InterruptedException {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
        driver.manage().window().maximize();


        Thread.sleep(3000);
        WebElement clickCar = driver.findElement(By.xpath("//a[@id='car-tab']"));
        clickCar.click();

        Thread.sleep(3000);
        WebElement clickAdvance= driver.findElement(By.xpath("(//a[@data-toggle='collapse'])[2]"));
        clickAdvance.click();

        Select CarType= new Select(driver.findElement(By.xpath("(//div[@id='collapseSix']//select[@class='select-contain-select'])[1]")));
        Assert.assertFalse(CarType.isMultiple());
        Assert.assertEquals(12,CarType.getOptions().size());
        CarType.selectByVisibleText("Economy");
        Assert.assertEquals("Economy",CarType.getFirstSelectedOption().getText());

        Select rental = new Select(driver.findElement(By.xpath("(//div[@id='collapseSix']//select[@class='select-contain-select'])[2]")));
        Assert.assertFalse(rental.isMultiple());
        Assert.assertEquals(21,rental.getOptions().size());
        rental.selectByVisibleText("Avis");
        Assert.assertEquals("Avis",rental.getFirstSelectedOption().getText());

        Select Discount= new Select(driver.findElement(By.xpath("(//div[@id='collapseSix']//select[@class='select-contain-select'])[3]")));
        Assert.assertFalse(Discount.isMultiple());
        Assert.assertEquals(3,Discount.getOptions().size());
        Discount.selectByVisibleText("Special or advertised");
        Assert.assertEquals("Special or advertised",Discount.getFirstSelectedOption().getText());




  //      (//li[@class='nav-item'])[5]
//        Select coach = new Select(driver.findElement(By.xpath("//div[@id = 'one-way']//select [@class = 'select-contain-select']")));
//
//        Assert.assertFalse(coach.isMultiple());
//        Assert.assertEquals(3, coach.getOptions().size());
//
//        coach.selectByVisibleText("Business");
//        Assert.assertEquals("Business", coach.getFirstSelectedOption().getText());
//
//        coach.selectByValue("3");
//        Assert.assertEquals("First class", coach.getFirstSelectedOption().getText());




    }
}
