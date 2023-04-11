package tuanTT;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class myTest {
    @Test
    public void testSum() {
        int a = 3;
        int b = 4;
        int result = a + b;
        assertEquals(7, result);
    }

    @Test
    public void testProduct() {
        int a = 3;
        int b = 4;
        int result = a * b;
        assertEquals(12, result);
    }
}
