package strategy_pattern.with_pattern;

public class CityBusTransportationStrategy implements TransportationToAirport {
    @Override
    public void transport() {
        System.out.println("Transporting with City Bus");
    }
}
