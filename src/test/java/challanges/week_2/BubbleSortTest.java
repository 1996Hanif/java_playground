package challanges.week_2;

import challenges.week_2.BubbleSort;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BubbleSortTest {
    Integer[] integer = {1,4,3,2,5,7,4};
    Integer[] integerTest = {1,2,3,4,4,5,7};
    ArrayList<Integer> array = new ArrayList<>(List.of(integer));
    ArrayList<Integer> arrayTest = new ArrayList<>(List.of(integerTest));
    @Test
    public void Test1(){assertEquals(arrayTest, BubbleSort.BubbleSort(array));};


}
