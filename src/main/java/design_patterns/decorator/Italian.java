package design_patterns.decorator;

public class Italian extends Pizza{
    @Override
    public String getDescription() {
        return "Italian";
    }

    @Override
    public double getCost() {
        return 20;
    }
}
