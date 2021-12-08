package junitAdv;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;


import java.time.LocalDate;
import java.util.Date;

public class SpartanTest {
    private Spartan spartan;
    @BeforeAll
    static void setupALL(TestInfo testInfo){
        System.out.println(testInfo.getTestClass()+ " executing");
    }
    @BeforeEach
    void setup(TestInfo testInfo){
        spartan = new Spartan(1, "Hanif", "Java", LocalDate.of(2012,12,4) );
        System.out.println(testInfo.getDisplayName());
    }

    @Test
    public void doTest(){
        //assertEquals(, spartan.getStartDate());
    }
    @AfterEach
    void tearDown(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName() + "has finished testing");
    }
    @AfterAll
    static void tearDownAll(TestInfo testInfo){
        System.out.println(testInfo.getDisplayName() + "Finished");
    }
}
