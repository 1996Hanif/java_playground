package oop.animal_farm;

public class Fox extends Animal implements Canine{


    public Fox(int legs) {
        super(legs);
    }

    @Override
    public String eat() {
        return "yummy";
    }

    @Override
    public String sound() {
        return "crying";
    }

    public static void main(String[] args) {

    }

    @Override
    public String hunt() {
        return "rabbit";
    }

    @Override
    public String run(String speed) {
        return speed;
    }

    @Override
    public String tricks(String trick) {
        return trick;
    }
}
