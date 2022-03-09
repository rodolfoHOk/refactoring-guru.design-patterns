package br.com.hioktec.designpatterns.criacionais.builder.builders;

import br.com.hioktec.designpatterns.criacionais.builder.cars.CarType;
import br.com.hioktec.designpatterns.criacionais.builder.cars.Manual;
import br.com.hioktec.designpatterns.criacionais.builder.components.Engine;
import br.com.hioktec.designpatterns.criacionais.builder.components.GPSNavigator;
import br.com.hioktec.designpatterns.criacionais.builder.components.Transmission;
import br.com.hioktec.designpatterns.criacionais.builder.components.TripComputer;

public class CarManualBuilder implements Builder {

	private CarType type;
    private int seats;
    private Engine engine;
    private Transmission transmission;
    private TripComputer tripComputer;
    private GPSNavigator gpsNavigator;

    public void setCarType(CarType type) {
        this.type = type;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public void setTripComputer(TripComputer tripComputer) {
        this.tripComputer = tripComputer;
    }

    public void setGPSNavigator(GPSNavigator gpsNavigator) {
        this.gpsNavigator = gpsNavigator;
    }

    public Manual getResult() {
        return new Manual(type, seats, engine, transmission, tripComputer, gpsNavigator);
    }
}
