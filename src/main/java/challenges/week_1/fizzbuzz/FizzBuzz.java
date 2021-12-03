package challenges.week_1.fizzbuzz;

import java.util.ArrayList;

public class FizzBuzz {

    private ArrayList<String> fizzBuzz_outcome = new ArrayList<String>();
    private ArrayList<String> error_message = new ArrayList<String>();
    private int highest_number;
    private int lowest_number;

    public FizzBuzz() {

    }
    public ArrayList<String> FizzBuzzCalculator(int highest_number){
        for (int i = 0; i < highest_number; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                fizzBuzz_outcome.add("FizzBuzz");
            else if (i % 3 == 0)
                fizzBuzz_outcome.add("Fizz");
            else if (i % 5 == 0)
                fizzBuzz_outcome.add("Buzz");
            else
                fizzBuzz_outcome.add(""+i);
        }
        return fizzBuzz_outcome;
    }
    public static void main(String[] args) {
       FizzBuzz fizzBuzz = new FizzBuzz();

       System.out.println(fizzBuzz.FizzBuzzCalculator(10).toString());
    }


}
