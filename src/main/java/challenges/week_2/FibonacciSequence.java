package challenges.week_2;

public class FibonacciSequence {
    public int loops = 3;
    public int FibonacciSequence(int number){
        loops = loops - 1;
        if (loops == 0)
            return number;

        return number + FibonacciSequence(number);
    }
}
