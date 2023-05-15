package vanNT.POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import vanNT.POM.core.basePage;
import vanNT.POM.element.loginElement;

import java.time.Duration;

public class loginPages extends basePage {

    loginElement loginE = new loginElement(driver);

    public loginPages(WebDriver driver) {
        super(driver);
    }
    public void inputMyEmail (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginE.stringMyEmail())));
        loginE.myEmailAddress.sendKeys("abc");
    }

    public void inputPassWord (){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(loginE.stringMyPassWord())));
        loginE.myPassWord.sendKeys("123");

    }


}
