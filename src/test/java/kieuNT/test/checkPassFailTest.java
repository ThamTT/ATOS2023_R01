package kieuNT.test;
import org.testng.Assert;
import org.testng.annotations.Optional;
import org.testng.annotations.Test;

public class checkPassFailTest {
        @Test
        public void test1(@Optional("1") int mark){

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
        public void test2(@Optional("52") int mark){

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
        public void test3(@Optional("109") int mark){

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
        public void test4(@Optional("50") int mark){

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
