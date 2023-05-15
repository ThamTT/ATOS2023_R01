package vanNT.POM.test;


import org.testng.annotations.Test;
import vanNT.POM.core.baseTest;
import vanNT.POM.pages.homePages;

public class homePageTest extends baseTest {
    @Test
    public void test(){
        homePages homepage = new homePages(getDriver());
        homepage.clickMyAccount();
    }
}
