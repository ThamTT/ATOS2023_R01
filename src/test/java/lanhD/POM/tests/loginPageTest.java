package lanhD.POM.tests;

import lanhD.POM.core.baseTest;
import lanhD.POM.pages.homePage;
import lanhD.POM.pages.loginPage;
import org.testng.annotations.Test;

public class loginPageTest extends baseTest {
    @Test
    public void testLogin(){
        homePage home = new homePage(getDriver());
        home.clickMyAccount();
        loginPage loginPage = new loginPage(getDriver());

    }
}
