package vanNT.POM.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import vanNT.POM.core.basePage;
import vanNT.POM.element.homeElement;

import java.time.Duration;

public class homePages extends basePage {
    homeElement homeElements = new homeElement(driver);
    public homePages(WebDriver driver) {
        super(driver);
    }
    //click menu

    public void clickMyAccount(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeElements.stringMyAccount())));
        homeElements.myAccountMenu.click();
    }

}
