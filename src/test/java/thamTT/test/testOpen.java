package thamTT.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class testOpen {
    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com.vn/?hl=vi");

    }
}
