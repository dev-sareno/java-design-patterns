package decorator_pattern.with_pattern.addons;

import decorator_pattern.with_pattern.IBeverage;

public class RedBeansAddOn extends AddOn {
    private static final double COST = 2.0;

    public RedBeansAddOn(IBeverage beverage) {
        super(beverage, COST);
    }
}
