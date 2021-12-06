package oop.animal_farm;

import java.util.ArrayList;
import java.util.List;

public class AnimalSanctuary {
    private dog harris = new dog();
    private dog jon = new dog();
    private Fox bill = new Fox(4);
    private Fox lisa = new Fox(4);
    private List<Animal> animalInTheSanctuary = new ArrayList<>();
    private List<Fox> foxesInTheSanctuary = new ArrayList<>();



    private AnimalSanctuary(){
        foxesInTheSanctuary.add(this.bill);
        foxesInTheSanctuary.add(this.lisa);

        animalInTheSanctuary.add(this.bill);
        animalInTheSanctuary.add(this.lisa);
    }
}
