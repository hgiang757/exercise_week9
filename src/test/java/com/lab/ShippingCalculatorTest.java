package com.lab;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ShippingCalculatorTest {

    @Test
    void testExpress() {
        ShippingCalculator calc = new ShippingCalculator();
        assertEquals(45000.0, calc.calculate(5, "EXPRESS"));
    }

    @Test
    void testInvalidWeight() {
        ShippingCalculator calc = new ShippingCalculator();
        assertThrows(IllegalArgumentException.class,
                () -> calc.calculate(-1, "STANDARD")
        );
    }
}