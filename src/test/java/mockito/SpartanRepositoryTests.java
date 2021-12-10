package mockito;

import junitAdv.Spartan;
import junitAdv.SpartanRepository;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.provider.Arguments;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;
import org.mockito.Mockito;

import java.time.LocalDate;

public class SpartanRepositoryTests {
    private Spartan mockSpartan;
    private Spartan manish;


    @BeforeEach
    void setup(){
        mockSpartan = Mockito.mock(Spartan.class);
        manish = new Spartan(1, "Manish", "Java", LocalDate.now());
    }

    @Test
    void mockingASpartan(){
        SpartanRepository.addSpartan(mockSpartan);

        Mockito.when(mockSpartan.toString()).thenReturn("Found Mock Spartan");//stubbing
        System.out.println(mockSpartan.toString());
        Assertions.assertEquals("Found Mock Spartan" + "\n", SpartanRepository.getAllSpartans());
    }
    @Test
    void chainMethodCallsWithAMock(){
        Mockito.when(mockSpartan.getStartDate())
                .thenReturn(LocalDate.now())
                .thenReturn(LocalDate.MAX);
        System.out.println(mockSpartan.getStartDate());
        System.out.println(mockSpartan.getStartDate());

    }
    @Test
    void usingASpy(){
        Spartan spyManish = Mockito.spy(manish);
        Mockito.when(spyManish.getName()).thenCallRealMethod();
    }
    @Test
    void internalMethodCallCheck(){
        SpartanRepository.addSpartan(mockSpartan);
        System.out.println(SpartanRepository.findSpartan(1).isPresent());
        Mockito.verify(mockSpartan, Mockito.times(1)).getId();
    }
    @Test
    void verifyOrderOfOperations(){
        mockSpartan.setName("Hanif");
        mockSpartan.setCourse("Data");
        System.out.println(mockSpartan.getName() + " " + mockSpartan.getCourse());

        InOrder inOrder = Mockito.inOrder(mockSpartan);
        inOrder.verify(mockSpartan).setName("Hanif");
        inOrder.verify(mockSpartan).setCourse("Data");
        inOrder.verify(mockSpartan).getName();
        inOrder.verify(mockSpartan).getCourse();

    }

    @Test
    void testArgumentCaptor(){
        ArgumentCaptor<String> captor = ArgumentCaptor.forClass(String.class);
        mockSpartan.setName("Hanif");
        Mockito.verify(mockSpartan).setName(captor.capture());
        System.out.println(captor.getValue());
    }
}
