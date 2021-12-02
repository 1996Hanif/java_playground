package junit_kick_start;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class CalculatorTests {

    Calculator calc = new Calculator();

    @Test
    public void additionTest(){
        assertEquals(4, calc.addition(2,2));
    }

}
