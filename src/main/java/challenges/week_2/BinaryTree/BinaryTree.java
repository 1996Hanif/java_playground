package challenges.week_2.BinaryTree;

import java.util.Arrays;


public class BinaryTree implements BinaryTreeInterface{
    private final Node rootNode;
    private int numberOfNodes;
    private int[] allNode;

    //CONSTRUCTOR: Initial node inputed with constructor
    public BinaryTree(final int element) {
        rootNode = new Node(element);
    }

    //getRootElement: returns root node value
    @Override
    public int getRootElement() {
        return rootNode.getValue();
    }

    //getNumberOfElements: returns number of nodes in binary tree
    @Override
    public int getNumberOfElements() {
        Node node = rootNode;
        //calls method to find all nodes starting from the root node
        findAllNodes(node, false);

        return numberOfNodes;
    }

    //findAllNodes: find all nodes under the node given
    private void findAllNodes(Node node, boolean showValues){
        //places all nodes values into an array, if values are wanted
        if (showValues == true){
            allNode[numberOfNodes] = node.getValue();
            showValues = true;
        }
        //counter used to count number of nodes in binary tree
        this.numberOfNodes++;

        //recursion used to find the all child's childs
        if  (!node.isLeftChildEmpty())
            findAllNodes(node.getLeftChild(),showValues);
        if  (!node.isRightChildEmpty())
            findAllNodes(node.getRightChild(), showValues);
    }

    //addElement: adding nodes to the tree
    @Override
    public  void addElement(final int element){
        addNodeToTree(rootNode, element);
    }

    //addElements: adding an array of nodes to the tree
    @Override
    public void addElements(int[] elements) {
        for (int i = 0; i < elements.length; i++)
            addElement(elements[i]);
    }

    //findElement: return true/false if value given is within the tree
    public boolean findElement(final int value){
        Node node = findNode(value);
        if (node != null){
            return true;
        }
        return false;
    }

    //getLeftChild: returns left child of given element
    @Override
    public int getLeftChild(int element) {
        //uses findNode() to get left child
        Node leftChild = findNode(element).getLeftChild();
        int childValue = leftChild.getValue();
        return childValue;
    }

    //getRightChild: returns right child of given element
    @Override
    public int getRightChild(int element) {
        //uses findNode() to get right child
        Node rightChild = findNode(element).getRightChild();
        int childValue = rightChild.getValue();
        return childValue;
    }

    //getSortedTreeAsc: returns an array of values in tree, in ascending order
    @Override
    public int[] getSortedTreeAsc() {
        //uses listNodeValues() to attain an array of all nodes in tree to then be sorted.
        int[] sortedAsc = listNodeValues();
        Arrays.sort(sortedAsc);

        return sortedAsc;
    }

    //getSortedTreeAsc: returns an array of values in tree, in descending order
    @Override
    public int[] getSortedTreeDesc() {
        int[] sortedAsc = getSortedTreeAsc();
        int[] sortedDesc = new int[sortedAsc.length];
        for (int i = 0; i < sortedDesc.length; i++) {
            sortedDesc[sortedDesc.length - i - 1] = sortedAsc[i];
        }

        return sortedDesc;
    }

    //listNodeValues: returns an array of all nodes in tree
    private int[] listNodeValues(){
        this.allNode = new int[getNumberOfElements()];
        numberOfNodes = 0;
        //using true, to place values found into allNode array
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

    //addNodeToTree: placing the node within the tree
    private void addNodeToTree(Node node, int element){
        if (element <= node.getValue()){
            if (node.isLeftChildEmpty()) {
                //places node to tree if left child is empty
                node.setLeftChild(new Node(element));
            }
            else
                addNodeToTree(node.getLeftChild(), element);
        }
        else if (element>node.getValue()) {
            if (node.isRightChildEmpty()) {
                //places node to tree if right child is empty
                node.setRightChild(new Node(element));
            }
            else
                addNodeToTree(node.getRightChild(), element);
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
        System.out.println("Descending Order:" + binaryTree.getLeftChild(32));
    }
}
