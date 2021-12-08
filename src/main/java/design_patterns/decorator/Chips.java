package design_patterns.decorator;

public class Chips extends Sides{

    public Chips(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " and Chips";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 20;
    }
}
