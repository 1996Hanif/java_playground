package challanges.week_2.BinaryTree;

import challenges.week_2.BinaryTree.BinaryTree;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTests {
    public BinaryTree binaryTree = new BinaryTree(40);
    public void AddElement(){
        binaryTree.addElement(30);
        binaryTree.addElement(320);
        binaryTree.addElement(32);
        binaryTree.addElement(240);
        binaryTree.addElement(32);
        binaryTree.addElement(70);
        binaryTree.addElement(232);
        binaryTree.addElement(20);
    }

    @Test
    public void GettingRootElement(){assertEquals(40, binaryTree.getRootElement());};
    @Test
    public void AddingElementsAndReceivingNumberOfNodes(){
        AddElement();
        assertEquals(5, binaryTree.getNumberOfElements());
    };
    @Test
    public void AddingElementsAsArrayAndReceivingSortedAscending(){
        int[] arrayOfNodes = {21,32,3,23};
        binaryTree.addElements(arrayOfNodes);
        int[] arrayOfNodesSorted = {3,21,23,32,40};
        assertArrayEquals(arrayOfNodesSorted, binaryTree.getSortedTreeAsc());
    };
    @Test
    public void AddingElementsAsArrayAndReceivingSortedDescending(){
        int[] arrayOfNodes = {21,32,3,23};
        binaryTree.addElements(arrayOfNodes);
        int[] arrayOfNodesSorted = {40,32,23,21,3};
        assertArrayEquals(arrayOfNodesSorted, binaryTree.getSortedTreeDesc());
    };
    @Test
    public void FindingElementInTree() {
        AddElement();
        assertTrue(binaryTree.findElement(30));
    }
    @Test
    public void NotFindingElementInTree() {
        AddElement();
        assertFalse(binaryTree.findElement(230));
    }
    @Test
    public void FindingLeftChild() {
        AddElement();
        assertEquals(20, binaryTree.getLeftChild(30));
    }
    @Test
    public void FindingRightChild() {
        AddElement();
        assertEquals(320, binaryTree.getRightChild(40));
    }


}
