package decorator_pattern.without_pattern.addons;

public class PearlsAddOn extends AddOnBeverage {
    private static final double COST = 2.0;

    public PearlsAddOn() {
        super(COST);
    }
}
