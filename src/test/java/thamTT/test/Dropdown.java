package thamTT.test;

import com.beust.ah.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Dropdown {
    @Test
    public void test() throws InterruptedException {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://techydevs.com/demos/themes/html/trizen-demo/trizen/index.html");
        driver.manage().window().maximize();
        Thread.sleep(5000);
        driver.findElement(By.id("cruise-tab")).click();

        Select coach = new Select(driver.findElement(By.xpath("//div[@id = 'cruise']//select [@class = 'select-contain-select']")));

//        Assert.assertFalse(coach.isMultiple());
//        Assert.assertEquals(3, coach.getOptions().size());

        List<String> arr = new ArrayList<>();

        for (WebElement item: coach.getOptions()){
            arr.add(item.getText());
            System.out.printf("  " + item.getText());
        }

        coach.selectByIndex(2);
        Assert.assertEquals("Alaska", coach.getFirstSelectedOption().getText());

    }
}
