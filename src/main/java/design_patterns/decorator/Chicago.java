package design_patterns.decorator;

public class Chicago extends Pizza{
    @Override
    public String getDescription() {
        return "Chicago";
    }

    @Override
    public double getCost() {
        return 30;
    }
}
