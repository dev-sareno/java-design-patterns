package decorator_pattern.without_pattern;

import decorator_pattern.without_pattern.addons.AddOnBeverage;
import decorator_pattern.without_pattern.addons.CoconutJellyAddOn;
import decorator_pattern.without_pattern.addons.PearlsAddOn;
import decorator_pattern.without_pattern.addons.PuddingAddOn;
import decorator_pattern.without_pattern.mainbeverage.CoffeeMilkTea;
import decorator_pattern.without_pattern.mainbeverage.MainBeverage;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // In this type of design, we maintain multiple
        //  variables; `mainBeverage` and `addOns`
        MainBeverage mainBeverage;
        // Here, we expose the instance of the list
        //  that keep track the add-ons and
        //  which in risk for unwelcome mutation or changes
        List<AddOnBeverage> addOns = new ArrayList<>();

        // Main beverage
        mainBeverage = new CoffeeMilkTea();

        // Add-ons
        // Add coconut jelly add-on
        addOns.add(new CoconutJellyAddOn());

        // Add pearls add-on
        addOns.add(new PearlsAddOn());

        // Add pudding add-on
        addOns.add(new PuddingAddOn());

        double totalCost = mainBeverage.getCost();

        // Here, an additional business logic
        //  for calculating the total cost
        for (AddOnBeverage addOn: addOns) {
            totalCost += addOn.getCost();
        }

        System.out.println("Total cost: " + totalCost);
    }
}
