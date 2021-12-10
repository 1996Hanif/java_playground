import junitAdv.Spartan;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;
import org.junit.jupiter.api.*;

import java.time.LocalDate;

public class HamcrestTests {
    private Spartan spartan;
    @BeforeEach
    void setup(){
        spartan = new Spartan(1, "Hanif", "Java", LocalDate.now());
    }
    @Nested
    class HamcrestSpartanTests{
        @Test
        void checkThatSpartanIsCalledHanif(){
            MatcherAssert.assertThat(spartan.getName(), Matchers.equalTo("Hanif"));
        }
        @Test
        void hamcrestSpartanHasAFieldCalledName(){
            MatcherAssert.assertThat(spartan, Matchers.hasProperty("name"));
        }
        @Test
        void hamcrestSpartanHasAFieldCalledCourseAndItIsSetToJAva(){
            MatcherAssert.assertThat(spartan, Matchers.hasProperty("course", Matchers.equalTo("Java")));
        }
    }

    @Nested
    class HamcrestStringMethods {
        @Test
        void hamcrestCheckAStringIsNullOrEmpty(){
            MatcherAssert.assertThat((spartan.getName()), Matchers.isEmptyOrNullString());
        }
        @Test
        void hamcrestCheckHanifEndsWithIf(){
            MatcherAssert.assertThat((spartan.getName()), Matchers.endsWith("if"));
        }
    }
}
