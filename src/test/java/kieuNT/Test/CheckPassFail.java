package kieuNT.Test;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class CheckPassFail {
        @Test
        @Parameters({"mark"})
        public void testCheckPassFail(int mark) {
            if (mark >= 50) {
                System.out.println("PASS");
            } else {
                System.out.println("FAIL");
            }
        }

}
