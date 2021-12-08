package design_patterns.factory;

public class Dog implements Speakable{
    @Override
    public String speak() {
        return "woof";
    }
}
