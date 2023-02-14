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
    }

    @Test
    public void multiply() {
    }

    @Test
    public void divide() {
    }
}