package tuanTT;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class testOpen {


    @AfterTest
    public void affterTest(){
        System.out.println("affter test");
    }
    @AfterSuite
    public void affterSuite(){
        System.out.println("After Suite");
    }

    @AfterClass
    public void AfterClass(){
        System.out.println("After Class");
    }
    @AfterGroups
    public void AfterGroups(){
        System.out.println("After AfterGroups");
    }
    @AfterMethod
    public void AfterMethod(){
        System.out.println("After Method");
    }
    @Test
    public void Test(){
        System.out.println("test 1");
    }

    @Test
    public void Test2(){
        System.out.println("test 12");
    }
    @Test
    public void Test3(){
        System.out.println("test 13");
    }
    @Test
    public void Test4(){
        System.out.println("test 14");
    }
    @Test
    public void Test5(){
        System.out.println("test 15");
    }

    @BeforeMethod
    public void BeforeMethod(){
        System.out.println("Before Method");
    }


    @BeforeGroups
    public void BeforeGroups(){
        System.out.println("BeforeGroups");
    }


    @BeforeClass
    public void BeforeClass(){
        System.out.println("Before Class");
    }
    @BeforeSuite
    public void BeforeSuite(){
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void beforeTest(){
        System.out.println("Befor test");
    }

}
