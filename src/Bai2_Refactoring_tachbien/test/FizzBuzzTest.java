package Bai2_Refactoring_tachbien.test;

import Bai2_Refactoring_tachbien.FizzBuzz;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void testFizz3(){
        int number = 3;
        String expected = "FIZZ";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz5(){
        int number = 5;
        String expected = "BUZZ";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz6(){
        int number = 6;
        String expected = "FIZZ";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz10(){
        int number = 10;
        String expected = "BUZZ";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz15(){
        int number = 15;
        String expected = "FIZZBUZZ";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
    @Test
    void testFizz30(){
        int number = 30;
        String expected = "FIZZBUZZ";
        String result = FizzBuzz.fizzBuzz(number);
        assertEquals(expected,result);
    }
}
