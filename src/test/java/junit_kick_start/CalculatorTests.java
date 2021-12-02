package junit_kick_start;

import static org.junit.jupiter.api.Assertions.assertEquals;

import core.arrays.ArrayExamples;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    Calculator calc = new Calculator();
    ArrayExamples test = new ArrayExamples();
    @Test
    public void additionTest(){
        assertEquals(4, calc.addition(2,2));
    }

    @Test
    public void expectedTest(){
        assertEquals(true, test.changeArrayOrder(2,2));
    }
    @Test
    public void outOfBoundsIndex(){
        assertEquals(false, test.changeArrayOrder(2,6));
    }
    @Test
    public void nonExistedValue(){
        assertEquals(false, test.changeArrayOrder(7,2));
    }

}
