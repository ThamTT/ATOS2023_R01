package kieuTN.test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class TestOpen {
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("before Suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Before test");
    }
    @Test(priority = 1)
    public void test(){
        System.out.println("test1");
    }
    @Test(priority = 2)
    public void test2(){
        System.out.println("test2");
    }
    @Test(priority = 0)
    public void test3(){
        System.out.println("test3");
    }
    @AfterTest
    public void afterTest(){
        System.out.println("After test");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("before method");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("after method");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("after suite");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("before class");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("after Class");
    }


}
