package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    private float num1 = 14.42f;
    private float num2 = 4.5f;
    @Test
    void add() {
        assertEquals(18.92f, Calculator.add(num1, num2));
    }

    @Test
    void subtract() {
        assertEquals(9.92f, Calculator.subtract(num1, num2));
    }

    @Test
    void divide() {
        assertThrows(IllegalArgumentException.class, () -> Calculator.divide(num1, 0f));
        assertEquals(3.2044444f, Calculator.divide(num1, num2));
    }

    @Test
    void multiply() {
        assertEquals(64.88999938964844, Calculator.multiply(num1, num2));
    }
}