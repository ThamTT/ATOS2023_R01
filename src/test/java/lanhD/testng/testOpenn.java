package lanhD.testng;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.*;

public class testOpenn {
    @BeforeTest
    public void beforeTest(){
        System.out.println("before test");
    }



    @Test
    public void test(){
        System.out.println("test1");
    }
    @Test
    public void test2(){
        System.out.println("test2");
    }
    @Test
    public void test3(){
        System.out.println("test3");
    }
    @AfterTest
    public  void afterTest(){
        System.out.println("after test");
    }
    @BeforeMethod
    public void beforeMethob(){
        System.out.println("before methob");
    }
    @AfterMethod
    public void afterMethob(){
        System.out.println("AterMethod");
    }
    @BeforeSuite
    public void beforesiute(){
        System.out.println("BeforeSuite");
    }
    @AfterSuite
    public void AfterSuite(){
        System.out.println("AfterSuite");
    }
    @BeforeClass
    public void BeforeClass(){
        System.out.println("BeforeClass");
    }
    @AfterClass
    public void AfterClass(){
        System.out.println("AfterClass");
    }





}
