package task02;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CplxTest {

    private static Cplx cplx;

    @BeforeEach
    public void setup() {
        cplx = new Cplx(2, 3);
    }

    @AfterEach
    public void finalizer() {
        cplx = null;
        System.gc();
    }

    @Test
    public void compareCplxArr() {
        double[] expected = {2, 3};
        assertArrayEquals(expected, cplx.getCplxArr());
    }

    @Test
    public void testToString() {
        assertEquals("2.0 + 3.0i", cplx.toString());
    }

    @Test
    public void testAddAss() {
        Cplx result = cplx.addAss(new Cplx(1, 1));
        assertEquals(new Cplx(3, 4), result);
    }

    @Test
    public void testSubAss() {
        Cplx result = cplx.subAss(new Cplx(1, 1));
        assertEquals(new Cplx(1, 2), result);
    }
}
