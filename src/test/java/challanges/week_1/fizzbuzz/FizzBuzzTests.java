package challanges.week_1.fizzbuzz;

import static org.junit.jupiter.api.Assertions.assertEquals;

import challenges.week_1.fizzbuzz.FizzBuzz;
import core.arrays.ArrayExamples;
import org.junit.jupiter.api.Test;

public class FizzBuzzTests {
    private FizzBuzz fizzBuzz = new FizzBuzz();
    @Test
    public void Test1(){
        assertEquals("[FizzBuzz, 1, 2, Fizz]", fizzBuzz.FizzBuzzCalculator(4).toString());
    }
    @Test
    public void Test2(){
        assertEquals("Buzz", fizzBuzz.FizzBuzzCalculator(7).get(5));
    }

}
