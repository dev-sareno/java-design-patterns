package decorator_pattern.without_pattern.mainbeverage;

public class CoffeeMilkTea extends MainBeverage {
    private static final double COST = 5.0;

    public CoffeeMilkTea() {
        super(COST);
    }
}
