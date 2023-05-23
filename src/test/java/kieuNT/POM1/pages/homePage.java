package kieuNT.POM1.pages;

import kieuNT.POM1.core.basePage;
import kieuNT.POM1.elements.homePageElements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class homePage extends basePage {
    homePageElements homeElements = new homePageElements(driver);
    public homePage(WebDriver driver) {
        super(driver);
    }
    public void clickMyAccount(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeElements.stringMyAccount())));
        homeElements.myAccountMenu.click();
    }
}
