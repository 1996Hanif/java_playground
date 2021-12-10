import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvFileSource;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.stream.Stream;

public class ParameterizedTests {
    @Nested
    class FirstTest{
        @ParameterizedTest(name = "[{index}] Testing for value = {arguments}")
        @ValueSource(ints = {2,2,3,5})
        void doTest(int number){
            Assertions.assertTrue(number<10);
        }
    }

    @ParameterizedTest
    @ValueSource(ints = {2,2,3,5})
    void doTest(int number){
        Assertions.assertTrue(number<10);
    }

    @ParameterizedTest
    @CsvFileSource(resources = "/names.csv")
    void doTest(String name){
        Assertions.assertEquals("Hanif", name);
    }
    @ParameterizedTest
    @MethodSource("printArrays")
    void testThatArraysCanBePrinted(Integer number, String name){
        System.out.println(number);
        System.out.println(name);
    }

    public static Stream<Arguments> printArrays(){
        return Stream.of(
                Arguments.arguments(1, "Hanif", "bob","bob"),
                Arguments.arguments(10, "Manish")
        );
    }
}
