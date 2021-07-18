package decorator_pattern.without_pattern.addons;

public abstract class AddOnBeverage {
    private final double cost;

    public AddOnBeverage(double cost) {
        this.cost = cost;
    }

    public double getCost() {
        return this.cost;
    }
}
