package kieuNT.POM1.tests;

import kieuNT.POM1.core.baseTest;
import kieuNT.POM1.pages.homePage;
import org.testng.annotations.Test;

public class homePageTest extends baseTest {
    @Test
    public void test(){
        homePage homepage = new homePage(getDriver());
        homepage.clickMyAccount();


    }
}
