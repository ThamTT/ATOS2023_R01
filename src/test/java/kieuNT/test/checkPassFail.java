package kieuNT.test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
public class checkPassFail {
    public static String checkMark(int mark) {
        if(mark >= 50 && mark < 100)
            return "PASS";
        else
            return "FAIL";
    }

}
