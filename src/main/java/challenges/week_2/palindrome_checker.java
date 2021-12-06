package challenges.week_2;

import java.util.Locale;

public class palindrome_checker {

    private String input;
    private int input_length;

    public palindrome_checker() {

    }

    public boolean palindrome_checkerChecker(String input){
        //puts input in lower case
        this.input = input.toLowerCase();
        this.input_length = input.length();

        //compare each character of input starting from first and last
        for (int i = 0; i < input_length; i++) {
            //if any of the match ups don't equal, method returns false
            if (this.input.charAt(i) != this.input.charAt(input_length -1 - i))
                return false;
        }
        return true;
    }

}
