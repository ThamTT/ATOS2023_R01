package tuanTT.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class testTable {
    @Test
    public void tabel() throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://www.techlistic.com/p/demo-selenium-practice.html");
        driver.manage().window().maximize();
        Thread.sleep(2000);
        WebElement table = driver.findElement(By.xpath("//table[@id='customers']"));
        java.util.List<WebElement> rows = table.findElements(By.tagName("tr"));

        for (WebElement row : rows){
            List<WebElement> cols =  row.findElements(By.tagName("td"));
            for (WebElement col:cols){
                System.out.printf("   " + col.getText());
            }
            System.out.printf("\n");

        }

        List<Map<String, String>> tableData = new ArrayList<>();

        for (WebElement row : rows) {
            List<WebElement> cols = row.findElements(By.tagName("td"));
            Map<String, String> rowData = new HashMap<>();
            int colIndex = 0;
            for (WebElement col : cols) {
                String colName = "col " + colIndex; // tạo tên cột theo chỉ số
                rowData.put(colName, col.getText()); // lưu nội dung ô vào Map
                colIndex++;
            }
            tableData.add(rowData); // lưu Map của hàng vào List
        }
        System.out.println("\nNghich bằng Map\n");
// In ra danh sách các Map
        for (Map<String, String> rowData : tableData) {
            for (String colName : rowData.keySet()) {
                System.out.printf("%s: %s\n", colName, rowData.get(colName));
            }
            System.out.println();
        }
    }
}
