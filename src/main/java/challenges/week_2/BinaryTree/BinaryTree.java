package challenges.week_2.BinaryTree;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class BinaryTree implements BinaryTreeInterface{
    private final Node rootNode;
    private int numberOfNodes;
    private int[] allNode;

    //initial node
    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    @Override
    public int getNumberOfElements() {
        Node node = rootNode;
        findAllNodes(node, false);

        return numberOfNodes;
    }

    private void findAllNodes(Node node, boolean showValues){


        if (showValues == true){
            allNode[numberOfNodes] = node.getValue();
            showValues = true;
        }

            this.numberOfNodes++;

        if  (!node.isLeftChildEmpty())
            findAllNodes(node.getLeftChild(),showValues);
        if  (!node.isRightChildEmpty())
            findAllNodes(node.getRightChild(), showValues);




    }

    //adding nodes to the tree
    @Override
    public  void addElement(final int element){
        addNodeToTree(rootNode, element);
    }

    @Override
    public void addElements(int[] elements) {
        for (int i = 0; i < elements.length; i++)
            addElement(elements[i]);
    }

    public boolean findElement(final int value){
        Node node = findNode(value);
        if (node != null){
            return true;
        }
        return false;
    }

    @Override
    public int[] getSortedTreeAsc() {
        int[] sortedAsc = listNodeValues();
        Arrays.sort(sortedAsc);

        return sortedAsc;
    }

    @Override
    public int[] getSortedTreeDesc() {
        int[] sortedAsc = getSortedTreeAsc();
        int[] sortedDesc = new int[getSortedTreeAsc().length];
        for (int i = 0; i < sortedDesc.length; i++) {
            sortedDesc[sortedDesc.length - i - 1] = sortedAsc[i];
        }

        return sortedDesc;
    }

    private int[] listNodeValues(){
        this.allNode = new int[getNumberOfElements()/2];
        numberOfNodes = 0;
        findAllNodes(rootNode, true);
        return allNode;
    }


    private Node findNode(int element){
        Node node = rootNode;
        while(node != null){
            if(element == node.getValue()){
                return node;
            }
            if(element < node.getValue()){
                node = node.getLeftChild();
            }
            else{
                node = node.getRightChild();
            }
        }
        return null;
    }

    //placing the node within the tree
    private void addNodeToTree(Node node, int element){
        if (element <= node.getValue()){
            if (node.isLeftChildEmpty()) {
                node.setLeftChild(new Node(element));
            }
            else{
                addNodeToTree(node.getLeftChild(), element);
            }
        }
        else if (element>node.getValue()) {
            if (node.isRightChildEmpty()) {
                node.setRightChild(new Node(element));
            } else {
                addNodeToTree(node.getRightChild(), element);
            }
        }
    }


    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTree(40);

        binaryTree.addElement(30);
        binaryTree.addElement(320);
        binaryTree.addElement(32);
        binaryTree.addElement(20);
        binaryTree.addElement(2);
        binaryTree.addElement(344);
        binaryTree.addElement(34);
        binaryTree.addElement(44);
        binaryTree.addElement(3844);

        int[] arrayOfNodes = {1,2,3,4};
        binaryTree.addElements(arrayOfNodes);



        System.out.println(binaryTree.findElement(8));
        System.out.println("Root Element:" + binaryTree.getRootElement());
        System.out.println("Number of Elements:" + binaryTree.getNumberOfElements());
        System.out.println("Ascending Order:" + Arrays.toString(binaryTree.getSortedTreeAsc()));
        System.out.println("Descending Order:" + Arrays.toString(binaryTree.getSortedTreeDesc()));
    }
}
