package thamTT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class wordWithElements {
    @Test
    public void main() throws InterruptedException {
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();

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
