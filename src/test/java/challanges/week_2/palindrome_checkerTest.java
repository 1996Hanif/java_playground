package challanges.week_2;

import challenges.week_2.palindrome_checker;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class palindrome_checkerTest {
    palindrome_checker palindrome_checker = new palindrome_checker();
    @Test
    public void Test1(){assertEquals(false, palindrome_checker.palindrome_checkerChecker("tool"));}
    @Test
    public void Test2(){assertEquals(true, palindrome_checker.palindrome_checkerChecker("radar"));}
    @Test
    public void Test3(){assertEquals(true, palindrome_checker.palindrome_checkerChecker("toot"));}
    @Test
    public void Test4(){assertEquals(false, palindrome_checker.palindrome_checkerChecker("hanif"));}
    @Test
    public void Test5(){assertEquals(true, palindrome_checker.palindrome_checkerChecker("Radar"));}
    @Test
    public void Test6(){assertEquals(true, palindrome_checker.palindrome_checkerChecker("2002"));}
    @Test
    public void Test7(){assertEquals(false, palindrome_checker.palindrome_checkerChecker("2111"));}
}
