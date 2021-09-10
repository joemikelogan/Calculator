package com.itstop.calculator;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {

    public void testAdd() {
        int expected = 40;
        int actual = Calculator.add(10, 30);
        assertEquals(expected, actual);
    }

    public void testSubtract() {
        int expected = -20;
        int actual = Calculator.subtract(10, 30);
        assertEquals(expected, actual);
    }

    public void testMultiply() {
        int expected = 300;
        int actual = Calculator.multiply(10, 30);
        assertEquals(expected, actual);
    }

    public void testDivide() {
        int expected = 3;
        int actual = Calculator.divide(30, 10);
        assertEquals(expected, actual);
    }
}