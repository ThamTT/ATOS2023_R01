package tuanTT.test;

public class checkPassFail {
    public static String checkMark(int mark) {
        if(mark >= 50 && mark < 100)
            return "PASS";
        else
            return "FAIL";
    }
}
