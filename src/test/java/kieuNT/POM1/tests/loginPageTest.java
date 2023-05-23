package kieuNT.POM1.tests;

import kieuNT.POM1.core.baseTest;
import kieuNT.POM1.pages.LoginPage;
import kieuNT.POM1.pages.homePage;
import org.testng.annotations.Test;

public class loginPageTest extends baseTest {
    @Test
    public void testLogin() throws InterruptedException {
        homePage home = new homePage(getDriver());
        home.clickMyAccount();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.inputlogin();

    }
}
