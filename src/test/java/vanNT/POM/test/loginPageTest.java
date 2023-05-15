package vanNT.POM.test;

import org.testng.annotations.Test;
import vanNT.POM.core.baseTest;
import vanNT.POM.pages.homePages;
import vanNT.POM.pages.loginPages;

public class loginPageTest extends baseTest {
    @Test
    public void test(){
        homePages homepage = new homePages(getDriver());
        homepage.clickMyAccount();
        loginPages loginPage = new loginPages(getDriver());
        loginPage.inputMyEmail();
        loginPage.inputPassWord();







    }

}
