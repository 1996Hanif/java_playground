package challenges.week_2;

import java.util.Locale;

public class palindrome_checker {

    public static boolean palindromeChecker(String input){
        //puts input in lower case
        input = input.toLowerCase();
        int input_length = input.length();

        //compare each character of input starting from first and last
        for (int i = 0; i < input_length; i++) {
            //if any of the match ups don't equal, method returns false
            if (input.charAt(i) != input.charAt(input_length -1 - i))
                return false;
        }
        return true;
    }

}
