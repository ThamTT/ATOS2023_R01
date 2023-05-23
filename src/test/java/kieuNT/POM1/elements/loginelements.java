package kieuNT.POM1.elements;

import kieuNT.POM1.core.basePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class loginelements extends basePage{
    public loginelements(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH,using = "//input[@type = 'email']")
    public WebElement Email;
    public String stringEmail(){
        return "//input[@type = 'email']";
    }
    @FindBy(how = How.XPATH,using = "//input[@type = 'password']")
    public WebElement Password;
    public String stringPassword(){
        return "//input[@type = 'password']";
    }

    @FindBy(how = How.XPATH,using = "//div[text()='Please enter a valid email address.']")
    public WebElement txtEmail;
    public String stringTxtEmail(){
        return "//div[text()='Please enter a valid email address.']";
    }
    @FindBy(how = How.XPATH,using = "//div[text()='Password must be at least 8 characters.']")
    public WebElement txtPassword;
    public String stringTxtPassword(){
        return "//div[text()='Password must be at least 8 characters.']";
    }
    @FindBy(how = How.XPATH,using = "//button[text()='Sign In']")
    public WebElement btnSignIn;
    public String stringbtnSignIn() {
        return "//button[text()='Sign In']";
    }
}
