package strategy_pattern.with_pattern;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        TransportationToAirport transportation;

        // This is where the runtime selection of strategy/algorithm happen
        //  as we can use transportation type of our choosing.
        transportation = new CityBusTransportationStrategy(); // City Bus
//        transportation = new PersonalCarTransportationStrategy(); // Personal Car
//        transportation = new TaxiTransportationStrategy(); // Taxi

        app.transport(transportation);
    }

    void transport(TransportationToAirport transportation) {
        // I'll just call the `transport()` method regardless of its type
        transportation.transport();
    }
}
