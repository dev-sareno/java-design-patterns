package decorator_pattern.with_pattern.mainbeverage;

import decorator_pattern.with_pattern.IBeverage;

public class Wintermelon implements IBeverage {
    @Override
    public double cost() {
        return 5.0;
    }
}
