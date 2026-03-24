package re;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    public void testAdd1To1() {
        int a = 1, b = 2;
        int expectValue = a + b;
        int actualValue = Calculator.add(a, b);
        assertEquals(expectValue, actualValue);
    }

    @Test
    public void testAdd1And2() {
        int a = 1, b = 2;
        int expectValue = a + b;
        int actualValue = Calculator.add(a, b);
        assertEquals(expectValue, actualValue);
    }
}
