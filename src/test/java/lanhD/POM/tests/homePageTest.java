package lanhD.POM.tests;

import lanhD.POM.core.baseTest;
import lanhD.POM.pages.homePage;
import org.testng.annotations.Test;

public class homePageTest extends baseTest {
    @Test
    public void test(){
        homePage homepage = new homePage(getDriver());
        homepage.clickMyAccount();

    }
}
