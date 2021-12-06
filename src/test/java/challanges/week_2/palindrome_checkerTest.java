package challanges.week_2;

import challenges.week_2.palindrome_checker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class palindrome_checkerTest {
    palindrome_checker palindrome_checker = new palindrome_checker();
    @Test
    public void Test1(){assertFalse(palindrome_checker.palindromeChecker("tool"));}
    @Test
    public void Test2(){assertTrue(palindrome_checker.palindromeChecker("radar"));}
    @Test
    public void Test5(){assertTrue(palindrome_checker.palindromeChecker("Radar"));}
    @Test
    public void Test6(){assertTrue(palindrome_checker.palindromeChecker("2002"));}
    @Test
    public void Test7(){assertFalse(palindrome_checker.palindromeChecker("2111"));}
}
