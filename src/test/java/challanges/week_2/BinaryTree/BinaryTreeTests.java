package challanges.week_2.BinaryTree;

import challenges.week_2.BinaryTree.BinaryTree;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTests {
    public BinaryTree binaryTree;
    @BeforeEach
    void AddElement(){
        binaryTree = new BinaryTree(40);
        binaryTree.addElement(30);
        binaryTree.addElement(320);
        binaryTree.addElement(32);
        binaryTree.addElement(240);
        binaryTree.addElement(32);
        binaryTree.addElement(70);
        binaryTree.addElement(232);
        binaryTree.addElement(20);
        int[] arrayOfNodes = {21,32,3,23};
        binaryTree.addElements(arrayOfNodes);

    }

    @Test
    public void gettingRootElement(){assertEquals(40, binaryTree.getRootElement());};

    @Test
    public void addingElementsAndReceivingNumberOfNodes(){
        assertEquals(5, binaryTree.getNumberOfElements());
    };

    @Test
    public void receivingSortedAscending(){
        int[] arrayOfNodesSorted = {3, 20, 21, 23, 30, 32, 32, 32, 40, 70, 232, 240, 320};
        assertArrayEquals(arrayOfNodesSorted, binaryTree.getSortedTreeAsc());
    };

    @Test
    public void receivingSortedDescending(){
        int[] arrayOfNodesSorted = {320, 240, 232, 70, 40, 32, 32, 32, 30, 23, 21, 20, 3};
        assertArrayEquals(arrayOfNodesSorted, binaryTree.getSortedTreeDesc());
    };

    @ParameterizedTest
    @ValueSource(ints = {30, 32, 20, 70})
    public void findingElementInTree(int number) {
        assertTrue(binaryTree.findElement(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {210, 21, 28, 77})
    public void notFindingElementInTree(int number) {
        assertFalse(binaryTree.findElement(number));
    }

    @ParameterizedTest
    @MethodSource("childOfElement")
    public void findingLeftChild(int leftChild, int node, int rightChild) {
        assertEquals(leftChild, binaryTree.getLeftChild(node));
    }

    @ParameterizedTest
    @MethodSource("childOfElement")
    public void findingRightChild(int leftChild, int node, int rightChild) {
        assertEquals(rightChild, binaryTree.getRightChild(node));
    }
    public static Stream<Arguments> childOfElement(){
        return Stream.of(
                Arguments.arguments(20, 30, 32),
                Arguments.arguments(30, 40, 320),
                Arguments.arguments(3, 20, 21)
        );
    }


}
