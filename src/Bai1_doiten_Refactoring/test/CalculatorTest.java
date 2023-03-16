package Bai1_doiten_Refactoring.test;

import Bai1_doiten_Refactoring.Calculator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Test addition")
    void testCalculateAdd() {
        int firstOperand = 2;
        int secondOperand = 1;
        char operator = '+';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test SUBTRACTION")
    void testCalculateSub() {
        int firstOperand = 10;
        int secondOperand = 3;
        char operator = '-';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test addition")
    void testCalculateMul() {
        int firstOperand = 3;
        int secondOperand = 7;
        char operator = '*';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }

    @Test
    @DisplayName("Test addition")
    void testCalculateDiv() {
        int firstOperand = 20;
        int secondOperand = 4;
        char operator = '/';
        int expected = 2;

        int result = Calculator.calculate(firstOperand, secondOperand, operator);
        assertEquals(expected, result);
    }
}
