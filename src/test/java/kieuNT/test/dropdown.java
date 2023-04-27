package kieuNT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class dropdown {
    @Test
    public void Test() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);

        Select coach = new Select(driver.findElement(By.xpath("//div[@id = 'one-way']//select [@class = 'select-contain-select']")));
        Assert.assertFalse(coach.isMultiple());
        Assert.assertEquals(3, coach.getOptions().size());

        coach.selectByVisibleText("Business");
        Assert.assertEquals("Business", coach.getFirstSelectedOption().getText());
        Thread.sleep(6000);
        coach.selectByValue("3");
        Assert.assertEquals("First class", coach.getFirstSelectedOption().getText());

        Thread.sleep(6000);

        WebElement cruise = driver.findElement(By.id("cruise-tab"));
        cruise.click();

        Select goingTo = new Select(driver.findElement(By.xpath("//div[@id = \"cruise\"]//select[@class = \"select-contain-select\"]")));

        Assert.assertFalse(goingTo.isMultiple());
        Assert.assertEquals(26, goingTo.getOptions().size());

        goingTo.selectByVisibleText("Caribbean");
        Assert.assertEquals("Caribbean",goingTo.getFirstSelectedOption().getText());






    }
}
