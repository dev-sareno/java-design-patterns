package decorator_pattern.with_pattern;

import decorator_pattern.with_pattern.addons.*;
import decorator_pattern.with_pattern.mainbeverage.CoffeeMilkTea;

public class Main {
    public static void main(String[] args) {
        // This is the major advantage of using a
        //  Decorator Pattern; we only maintain 1 variable
        IBeverage beverage;

        // Main beverage
        beverage = new CoffeeMilkTea();

        // Add-ons
        // Add coconut jelly add-on
        beverage = new CoconutJellyAddOn(beverage);

        // Add pearls add-on
        beverage = new PearlsAddOn(beverage);

        // Add pudding add-on
        beverage = new PuddingAddOn(beverage);

        System.out.println("Total cost: " + beverage.cost());
    }
}
