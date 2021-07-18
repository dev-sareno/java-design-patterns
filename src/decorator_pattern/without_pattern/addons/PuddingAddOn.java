package decorator_pattern.without_pattern.addons;

public class PuddingAddOn extends AddOnBeverage {
    private static final double COST = 2.0;
    public PuddingAddOn() {
        super(COST);
    }
}
