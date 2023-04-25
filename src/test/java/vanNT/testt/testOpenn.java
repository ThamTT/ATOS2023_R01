package vanNT.testt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.edge.EdgeDriver;

public class testOpenn {
    public static void main(String[] args) {
        ChromeOptions options = new ChromeOptions();

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com.vn/?hl=vi");

    }
}