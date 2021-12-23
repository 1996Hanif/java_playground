package generic;

import java.time.LocalDate;

public class GenericFinder {
    private static <T> boolean findInArray(T[] arrayToCheck, T objectToFind){
        boolean answer = false;
        for (T object: arrayToCheck){
            if (objectToFind.equals(object)){
                answer = true;
                break;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        String[] words = {"A", "E", "I","O","U"};
        Integer[] numbers = {1,2,3,4,5};
        LocalDate[] dates = {LocalDate.now(), LocalDate.MAX};
        System.out.println(findInArray(words, "O"));
        System.out.println(findInArray(numbers, 2));
        System.out.println(findInArray(dates, LocalDate.now()));

    }
}
