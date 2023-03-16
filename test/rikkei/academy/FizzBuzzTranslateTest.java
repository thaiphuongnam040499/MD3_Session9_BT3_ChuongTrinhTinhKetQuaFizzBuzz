package rikkei.academy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTranslateTest {

    @Test
    void traslate() {
        int number = 3;
        String expected = "Fizz";
        String result = FizzBuzzTranslate.traslate(number);
        assertEquals(expected,result);
    }
    @Test
    void traslate1() {
        int number = 5;
        String expected = "Buzz";
        String result = FizzBuzzTranslate.traslate(number);
        assertEquals(expected,result);
    }
    @Test
    void traslate2() {
        int number = 15;
        String expected = "FizzBuzz";
        String result = FizzBuzzTranslate.traslate(number);
        assertEquals(expected,result);
    }
}