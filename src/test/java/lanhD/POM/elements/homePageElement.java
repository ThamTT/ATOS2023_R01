package lanhD.POM.elements;

import lanhD.POM.core.basePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePageElement extends basePage {

    public homePageElement(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//a[text() = 'My Account']")
    public WebElement myAccountMenu;

    @FindBy(how = How.XPATH, using = "//input[@name='email']")
    public WebElement myEmailAdress;

    @FindBy(how = How.XPATH, using = "//input[@name='password']")
    public WebElement myPassword;

    @FindBy(how = How.XPATH,using = "//div[text()='Please enter a valid email address.']")
    public WebElement MyTextEmail;

    @FindBy(how = How.XPATH,using = "//div[text()='Password must be at least 8 characters.']")
    public WebElement myTextPassword;

    @FindBy(how = How.XPATH,using = "//button[text()='Sign In']")
    public WebElement MySignInButton;

    @FindBy(how = How.XPATH,using = "//a[text()='Forgot Password?']")
    public WebElement myclick;



    public String stringMyAccount(){
        return "//a[text() = 'My Account']";
    }

    public String stringMyEmailAdress(){
        return "//input[@name='email']";
    }

    public String stringPassWord(){
        return "//input[@name='password']";
    }

    public String stringMyTextEmail(){
        return "//div[text()='Please enter a valid email address.']";
    }

    public String stringMyTextPassword(){
        return "//div[text()='Password must be at least 8 characters.']";
    }

    public String stringSignInButton(){
        return "//button[text()='Sign In']";
    }

    public String StringClick(){
        return "//a[text()='Forgot Password?']";
    }
}
