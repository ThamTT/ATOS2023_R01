package vanNT.POM.element;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import vanNT.POM.core.basePage;

public class homeElement extends basePage {

    public homeElement (WebDriver driver){

        super(driver);
    }
    @FindBy(how = How.XPATH, using = "//a[text()='My Account']")
    public WebElement myAccountMenu;

    public String stringMyAccount() {
        return "//a[text() = 'My Account']";
    }
}
