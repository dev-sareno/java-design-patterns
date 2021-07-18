package strategy_pattern.with_pattern;

public class TaxiTransportationStrategy implements TransportationToAirport {
    @Override
    public void transport() {
        System.out.println("Transporting with Taxi");
    }
}
