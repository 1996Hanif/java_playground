package generic;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Task {
    private static <T> T[] findInArray(T[] arrayToCheck){
        Arrays.sort(arrayToCheck);
        return arrayToCheck;
    }


    public static void main(String[] args) {
        Double[] doubles = {10.0,2.0,11.0,3.0,5.0};
        Integer[] integers = {1,43,3,1,5};
        Float[] floats = {2f,6f,34f,23f,23f,6f};
        System.out.println(Arrays.toString(findInArray(doubles)));
        System.out.println(Arrays.toString(findInArray(integers)));
        System.out.println(Arrays.toString(findInArray(floats)));

    }
}
