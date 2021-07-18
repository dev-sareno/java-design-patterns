package decorator_pattern.without_pattern.mainbeverage;

public abstract class MainBeverage {
    private final double cost;

    public MainBeverage(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }
}
