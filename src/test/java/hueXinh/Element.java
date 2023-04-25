package hueXinh;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
public class Element {
    @Test
    public void main(){
        ChromeOptions options= new ChromeOptions();
        options.addArguments("--remote-allow-origins=*");
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-checkbox/");
        driver.manage().window().maximize();

        //driver.findElement(By.xpath("//input[@name='checkbox-0 ']/..")).click();


        driver.findElement(By.xpath("//label[@for='checkbox-v-2a']/..")).click();
        driver.findElement(By.xpath("//label[@for='checkbox-v-2b']/..")).click();
        driver.findElement(By.xpath("//label[normalize-space(text()) = 'Three']")).click();

        driver.findElement(By.xpath("//a[normalize-space(text()) = 'Checkboxradio widget']")).click();
        driver.findElement(By.xpath("(//a[normalize-space(text()) = 'Radio buttons'])[1]")).click();
//        WebElement check= driver.findElement(By.xpath("//input[@id='radio-choice-0a']/.."));
//        if (!check.isSelected()){
//            check.click();
//        }
        WebElement check2= driver.findElement(By.xpath("//input[@id='radio-choice-v-6a']"));
        if (check2.isSelected()){
            driver.findElement(By.xpath("//input[@id='radio-choice-v-6b']/..")).click();
        }


    }
}
