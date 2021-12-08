package design_patterns.factory;

public class Main {
    public static void main(String[] args) {
        Speakable dog = AnimalFactory.getAnimal("dog");
        System.out.println(dog.speak());
    }
}
