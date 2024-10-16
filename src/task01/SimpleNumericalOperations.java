package task01;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public
class SimpleNumericalOperations{
    public int add(int a, int b){
        return a + b;  // didn't pass the test, have to change a-b to a+b
    }

    public boolean isPositive(int value){
        return value > 0; // didn't pass the test, have to change value < 0 to value > 0
    }

    public boolean isNegative(int value){
        return value <= 0; // didn't pass the test, have to change value >= 0 to value <= 0
    }

    @Test
        public void testAddition() {
        assertEquals(3, add(2,1));
    }

    @Test
        public void testPogNeg(){
        assertAll(
                () -> assertFalse(isNegative(1)),
                () -> assertTrue(isNegative(-1)),
                () -> assertFalse(isPositive(-1)),
                () -> assertTrue(isPositive(1))
        );
    }

}