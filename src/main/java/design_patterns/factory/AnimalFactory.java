package design_patterns.factory;

public class AnimalFactory {
    public static Speakable getAnimal(String animal){
        if (animal.equals("dog")){
            return new Dog();
        }
        else if (animal.equals("cat")){
            return new Cat();
        }
        else if (animal.equals("goldfish")){
            return new Goldfish();
        }
        return null;
    }
}
