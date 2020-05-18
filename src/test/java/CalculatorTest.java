import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    void setup() {
        calculator = new Calculator();
    }

    @AfterEach
    void teardown() {

    }

    @Test
    void testSum() {
        var result = calculator.sum(1, 2);

        assertEquals(3, result);
    }

    @Test
    void testSumWithNoParameter() {
        var result = calculator.sum();

        assertEquals(0, result);
    }

    @Test
    void testSumWithNull() {
        var result = calculator.sum(null);

        assertEquals(0, result);
    }

    @Test
    void testMulti() {
        var result = calculator.multiply(10, 5);

        assertEquals(50, result);
    }

    @Test
    void testMultiWithNoParameter() {
        var result = calculator.multiply();

        assertEquals(1, result);
    }

    @Test
    void testMultiWithNull() {
        var result = calculator.multiply(null);

        assertEquals(0, result);
    }

}