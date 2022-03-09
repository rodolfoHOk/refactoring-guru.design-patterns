package br.com.hioktec.designpatterns.criacionais.builder.director;

import br.com.hioktec.designpatterns.criacionais.builder.builders.Builder;
import br.com.hioktec.designpatterns.criacionais.builder.cars.CarType;
import br.com.hioktec.designpatterns.criacionais.builder.components.Engine;
import br.com.hioktec.designpatterns.criacionais.builder.components.GPSNavigator;
import br.com.hioktec.designpatterns.criacionais.builder.components.Transmission;
import br.com.hioktec.designpatterns.criacionais.builder.components.TripComputer;

public class Director {
	
	public void constructSportsCar(Builder builder) {
        builder.setCarType(CarType.SPORTS_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(3.0, 0));
        builder.setTransmission(Transmission.SEMI_AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructCityCar(Builder builder) {
        builder.setCarType(CarType.CITY_CAR);
        builder.setSeats(2);
        builder.setEngine(new Engine(1.2, 0));
        builder.setTransmission(Transmission.AUTOMATIC);
        builder.setTripComputer(new TripComputer());
        builder.setGPSNavigator(new GPSNavigator());
    }

    public void constructSUV(Builder builder) {
        builder.setCarType(CarType.SUV);
        builder.setSeats(4);
        builder.setEngine(new Engine(2.5, 0));
        builder.setTransmission(Transmission.MANUAL);
        builder.setGPSNavigator(new GPSNavigator());
    }
}
