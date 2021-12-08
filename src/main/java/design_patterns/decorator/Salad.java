package design_patterns.decorator;

public class Salad extends Sides{

    public Salad(Pizza pizza){
        super(pizza);
    }
    @Override
    public String getDescription() {
        return pizza.getDescription() + " and Salad";
    }

    @Override
    public double getCost() {
        return pizza.getCost() + 10;
    }
}
