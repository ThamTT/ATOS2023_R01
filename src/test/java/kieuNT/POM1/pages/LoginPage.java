package kieuNT.POM1.pages;

import kieuNT.POM1.core.basePage;
import kieuNT.POM1.elements.loginelements;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class LoginPage extends basePage {
    loginelements login =new loginelements(driver);
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    public void inputlogin() {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(login.stringEmail())));
        login.Email.click();
        login.Email.sendKeys("ntkieu");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(login.stringPassword())));
        login.Password.click();
        login.Password.sendKeys("012");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(login.stringTxtEmail())));
        String messageEmail = login.txtEmail.getText();
        Assert.assertEquals(messageEmail,"Please enter a valid email address.","Not equal");

        login.Email.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(login.stringTxtPassword())));
        String messagePassword = login.txtPassword.getText();
        Assert.assertEquals(messagePassword,"Password must be at least 8 characters.","Not equal");

//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(login.stringTxtPassword())));
//        String messagePassword = login.txtPassword.getText();
//        Assert.assertEquals(messagePassword,"Password must be at least 8 characters.","Not equal");
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(login.stringbtnSignIn())));
        login.btnSignIn.click();
    }

}
