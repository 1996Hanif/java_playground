package oop.animal_farm;

public class dog extends Animal implements Canine{


    public dog() {
        super(4);
    }

    @Override
    public String eat() {
        return "meat";
    }

    @Override
    public String sound() {
        return "bark";
    }

    @Override
    public String hunt() {
        return "null";
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
