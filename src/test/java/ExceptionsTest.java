import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;

public class ExceptionsTest {
    private ArrayList<Integer> numbers;

    @BeforeEach
    void setup(){
        numbers = new ArrayList<>(Arrays.asList(1,2,3,4,5));
    }
    @ParameterizedTest
    @ValueSource(ints = {5,7,10})
    void checkOutOFBoundsException(int number){
        Assertions.assertThrows(IndexOutOfBoundsException.class,() -> numbers.get(number));

    }
}
