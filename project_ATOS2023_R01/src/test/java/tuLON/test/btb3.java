package tuLON.test;

import org.testng.annotations.*;

public class btb3 {
    @BeforeSuite
    public void beforesuite(){
        System.out.println("Before Suite");
    }
    @BeforeTest
    public void beforetest(){ System.out.println("BeforeTest"); }

    @BeforeClass
    public void beforeclass(){
        System.out.println("BeforeClass");
    }
    @BeforeMethod
    public void beforemethod(){
        System.out.println("BeforeMethod");
    }
    @Test(priority = 0)
    public void test1(){
        System.out.println("TestCase1");
    }
    @Test(priority = 1)
    public void test2(){
        System.out.println("TestCase2");
    }
    @AfterMethod
    public void aftermethod(){
        System.out.println("AfterMethod");
    }
    @AfterClass
    public void afterclass(){
        System.out.println("AfterClass");
    }
    @AfterTest
    public void aftertest(){System.out.println("AfterTest");}
    @AfterSuite
    public void aftersuite(){
        System.out.println("AfterSuite");
    }
}
