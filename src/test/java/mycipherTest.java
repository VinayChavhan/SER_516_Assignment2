import org.junit.Test;

import static org.junit.Assert.*;

public class mycipherTest {

    mycipher cipher=new mycipher();
    @Test
    public void add() {
        int result = cipher.add(2,3);
        assertEquals(5, result);
    }

    @Test
    public void subtract() {
        int result = cipher.subtract(4,2);
        assertEquals(2, result);
    }

    @Test
    public void multiply() {
        int result = cipher.multiply(4,2);
        assertEquals(8, result);
    }

    @Test
    public void divide() {
        int result = cipher.divide(10,2);
        assertEquals(5, result);
    }
}