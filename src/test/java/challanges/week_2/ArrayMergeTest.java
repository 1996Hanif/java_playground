package challanges.week_2;

import challenges.week_2.ArrayMerge;
import challenges.week_2.BubbleSort;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ArrayMergeTest {
    ArrayMerge arrayMerge = new ArrayMerge(new int[]{2,334,35},new int[]{23,334,62});
    int [] array = arrayMerge.CombinedArray();
    int[] combinedArrayTest = {2,334,35,23,334,62};
    int[] accendingOrderTest = {2,23,35,62,334,334};
    int[] descendingOrderTest = {334,334,62,35,23,2};
    int[] duplicateRemoverTest = {2,334,35,23,62};
    @Test
    public void CombinedArrayTest(){assertArrayEquals(combinedArrayTest, arrayMerge.CombinedArray());};
    @Test
    public void AccendingOrderTest(){assertArrayEquals(accendingOrderTest, arrayMerge.AccendingOrder());};
    @Test
    public void DescendingOrderTest(){assertArrayEquals(descendingOrderTest, arrayMerge.DescendingOrder());};
    @Test
    public void DuplicateRemoverTest(){assertEquals(duplicateRemoverTest.length, arrayMerge.DuplicateRemover().length);};
}
