package lanhD.POM.pages;

import lanhD.POM.core.basePage;
import lanhD.POM.elements.homePageElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.time.Duration;

public class homePage extends basePage {
    homePageElement homeElement= new homePageElement(driver);

    public homePage(WebDriver driver) {
        super(driver);
    }
    //click menu

    public void clickMyAccount(){
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(30));
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeElement.stringMyAccount())));
        homeElement.myAccountMenu.click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeElement.stringMyEmailAdress())));
        homeElement.myEmailAdress.click();
        homeElement.myEmailAdress.sendKeys("lan anh");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeElement.stringPassWord())));
        homeElement.myPassword.click();
        homeElement.myPassword.sendKeys("123");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeElement.stringMyTextEmail())));
        String messageEmail = homeElement.MyTextEmail.getText();
        Assert.assertEquals(messageEmail,"Please enter a valid email address.","Not equal");

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeElement.stringMyTextPassword())));


        String messagePassword = homeElement.myTextPassword.getText();
       // homeElement.myclick.click();
       // homeElement.MySignInButton.click();
        Assert.assertEquals(messagePassword,"Password must be at least 8 characters.","Not equal");



        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(homeElement.stringSignInButton())));
        homeElement.MySignInButton.click();



    }
}
