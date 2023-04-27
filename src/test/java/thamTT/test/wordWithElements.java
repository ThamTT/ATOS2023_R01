package thamTT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Wait;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        String headersString = "";
        Map<String, String> map = new  HashMap<String, String>();
        int count = 0;
        int i = -1;

        for (WebElement row : rows){
            count ++;

            List<WebElement> cols = row.findElements(By.tagName("td"));
            List<WebElement> headers = row.findElements(By.tagName("th"));

            if(count == 1)
                for (WebElement header:headers){
                   headersString += header.getText() + " ";
                }

            if(count > 1)
                for (WebElement col:cols){
                    map.put(headersString.split(" ")[i++], col.getText());
                }

            if(count >= 2){
                break;
            }
        }

        for (Map.Entry<String, String> item: map.entrySet()){
            System.out.printf(item.getKey() + " - " + item.getValue() + "\n");
        }

    }
}
