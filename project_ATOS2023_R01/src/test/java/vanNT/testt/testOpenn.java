package vanNT.testt;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class testOpenn {

    @BeforeSuite
    public void beforeSuite (){
        System.out.printf("BeforSuite\n");
    }

    @BeforeTest
    public void beforeTest (){
        System.out.printf("BeforeTest\n");
    }

    @BeforeClass
    public void beforeClass (){
        System.out.printf("BeforeClass\n");
    }

    @BeforeMethod
    public void beforeMethod (){
        System.out.printf("BeforeMethod\n");
    }

    @Test
    public void TestCase1 (){
        System.out.printf("Test Case 1\n");
    }

    @AfterMethod
    public void afterMethod (){
        System.out.printf("AfterMethod\n");
    }

    @BeforeMethod
    public void BeforeMethod (){
        System.out.printf("BeforeMethod\n");
    }

    @Test
    public void TestCase2 (){
        System.out.printf("Test Case 2\n");
    }

    @AfterMethod
    public void AfterMethod (){
        System.out.printf("AfterMethod\n");
    }

    @AfterClass
    public void AfterClass (){
        System.out.printf("Afterclass\n");
    }

    @AfterTest
    public void AfterTest (){
        System.out.printf("AfterTest\n");
    }

    @AfterSuite
    public void AfterSuite (){
        System.out.printf("AfterSuite");
    }

    public static void main(String[] args) {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.google.com.vn/?hl=vi");

    }
}