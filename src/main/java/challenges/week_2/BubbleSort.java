package challenges.week_2;

import java.util.ArrayList;
import java.util.Arrays;

public class BubbleSort {
    public static ArrayList BubbleSort(ArrayList<Integer> input){

        boolean sorted = false;
        int numSorted = 0;
        int temporaryHolder;

        for (int j = 0; j < input.toArray().length - 1; j++) {
            for (int i = 0; i < input.toArray().length - 1; i++) {
                if (input.get(i) > input.get(i + 1)) {
                    temporaryHolder = input.get(i);
                    input.set(i, input.get(i + 1));
                    input.set(i + 1, temporaryHolder);
                }
            }
        }

        return input;
    }

    public static void main(String[] args) {


        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(6);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);
        numbers.add(5);
        numbers.add(3);
        numbers.add(2);

        System.out.println(BubbleSort(numbers));
    }
}
