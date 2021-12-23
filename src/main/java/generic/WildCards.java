package generic;

public class WildCards {
    //lower-bound wildcard - Box<? extends Exception
    //upper-bound wildcard - Box<? super Integer
    private static void printTheBox(Box<? super Integer> box){
        System.out.println("the box contains "+ box.getItem());
    }

    public static void main(String[] args) {
        Box<Number> box = new Box<>();
        printTheBox(box);
    }
}
