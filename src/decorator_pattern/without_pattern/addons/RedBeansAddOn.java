package decorator_pattern.without_pattern.addons;

public class RedBeansAddOn extends AddOnBeverage {
    private static final double COST = 2.0;

    public RedBeansAddOn() {
        super(COST);
    }
}
