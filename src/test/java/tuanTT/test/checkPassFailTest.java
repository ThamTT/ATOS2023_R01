package tuanTT.test;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class checkPassFailTest {

    @Test
    public void test1(@Optional("99") int mark){

        String rs="";
        if(mark >= 50){
            rs = "PASS";
        }else{
            rs = "FAIL";
        }
        String actual = checkPassFail.checkMark(mark);
        Assert.assertEquals(actual, rs);
    }
    @Test
    public void test2(@Optional("55") int mark){

        String rs="";
        if(mark >= 50){
            rs = "PASS";
        }else{
            rs = "FAIL";
        }
        String actual = checkPassFail.checkMark(mark);
        Assert.assertEquals(actual, rs);
    }
    @Test
    public void test3(@Optional("6") int mark){

        String rs="";
        if(mark >= 50){
            rs = "PASS";
        }else{
            rs = "FAIL";
        }
        String actual = checkPassFail.checkMark(mark);
        Assert.assertEquals(actual, rs);
    }
    @Test
    public void test4(@Optional("222") int mark){

        String rs="";
        if(mark >= 50){
            rs = "PASS";
        }else{
            rs = "FAIL";
        }
        String actual = checkPassFail.checkMark(mark);
        Assert.assertEquals(actual, rs);
    }
}
