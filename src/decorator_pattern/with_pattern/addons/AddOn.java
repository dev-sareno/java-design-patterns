package decorator_pattern.with_pattern.addons;

import decorator_pattern.with_pattern.IBeverage;

public abstract class AddOn implements IBeverage {
    private final IBeverage beverage;
    private final double cost;

    public AddOn(IBeverage beverage, double cost) {
        this.beverage = beverage;
        this.cost = cost;
    }

    @Override
    public double cost() {
        return this.beverage.cost() + this.cost;
    }
}
