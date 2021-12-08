package design_patterns.decorator;

public class Main {
    public static void main(String[] args) {
        Italian italian = new Italian();
        System.out.println(italian.getDescription() + " Cost: " + italian.getCost());

        Salad salad = new Salad(italian);
        System.out.println(salad.getDescription() + " Cost: " + salad.getCost());
        Chips chips = new Chips(italian);
        System.out.println(chips.getDescription() + " Cost: " + chips.getCost());
    }
}
