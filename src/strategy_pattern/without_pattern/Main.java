package strategy_pattern.without_pattern;

public class Main {
    public static void main(String[] args) {
        Main app = new Main();

        // This is one of the ugly parts of NOT using
        //  an Strategy Pattern; codes are convoluted.
        // Just imagine if we add another type of transportation.

        // City Bus
        CityBusTransportation cityBusTransportation = new CityBusTransportation();
        app.transportWithCityBus(cityBusTransportation);

        // Personal Car
        PersonalCarTransportation personalCarTransportation = new PersonalCarTransportation();
        app.transportWithPersonalCar(personalCarTransportation);

        // Taxi
        TaxiTransportation taxiTransportation = new TaxiTransportation();
        app.transportWithTaxi(taxiTransportation);
    }

    void transportWithCityBus(CityBusTransportation transportation) {
        transportation.transport();
    }

    void transportWithPersonalCar(PersonalCarTransportation transportation) {
        transportation.transport();
    }

    void transportWithTaxi(TaxiTransportation transportation) {
        transportation.transport();
    }
}
