package kieuNT.POM1.elements;

import kieuNT.POM1.core.basePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class homePageElements extends basePage {
    public homePageElements(WebDriver driver) {
        super(driver);
    }
    @FindBy(how = How.XPATH,using = "//a[text() = 'My Account']")
    public WebElement myAccountMenu;

    public String stringMyAccount(){
        return "//a[text() = 'My Account']";
    }
}
