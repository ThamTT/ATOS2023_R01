package lanhD.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

import java.util.List;

public class table {
    @Test
    public void table(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver= new ChromeDriver(options);
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();

        WebElement table = driver.findElement(By.id("customers"));

//        List<WebElement> rows = table.findElements(By.tagName("tr"));
//
//        for (WebElement row : rows){
//            List<WebElement> cols = row.findElements(By.tagName("td"));
//            for (WebElement col:cols){
//                System.out.printf("   " + col.getText());
//            }
//            System.out.printf("\n");
//        }




        WebElement findRow = table.findElement(By.xpath("(//tr)[1]"));
        String rowText = findRow.getText();
        System.out.println(rowText);

        WebElement findRow2 = table.findElement(By.xpath("(//tr)[2]"));
        String rowText2 = findRow2.getText();
        System.out.println(rowText2);


    }
}
