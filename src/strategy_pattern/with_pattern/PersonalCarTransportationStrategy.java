package strategy_pattern.with_pattern;

public class PersonalCarTransportationStrategy implements TransportationToAirport {
    @Override
    public void transport() {
        System.out.println("Transporting with Personal Car");
    }
}
