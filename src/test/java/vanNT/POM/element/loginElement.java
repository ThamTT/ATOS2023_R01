package vanNT.POM.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import vanNT.POM.core.basePage;

public class loginElement extends basePage {
    public loginElement(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//input[@type='email']")
    public WebElement myEmailAddress;

    public String stringMyEmail(){
        return "//input[@type='email']";
    }

    @FindBy(how = How.XPATH,using = "//input[@type='password']")
    public WebElement myPassWord;

    public String stringMyPassWord (){
        return "//input[@type='password']";
    }

}

