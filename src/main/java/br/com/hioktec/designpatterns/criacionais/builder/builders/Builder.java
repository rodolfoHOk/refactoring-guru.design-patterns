package br.com.hioktec.designpatterns.criacionais.builder.builders;

import br.com.hioktec.designpatterns.criacionais.builder.cars.CarType;
import br.com.hioktec.designpatterns.criacionais.builder.components.Engine;
import br.com.hioktec.designpatterns.criacionais.builder.components.GPSNavigator;
import br.com.hioktec.designpatterns.criacionais.builder.components.Transmission;
import br.com.hioktec.designpatterns.criacionais.builder.components.TripComputer;

public interface Builder {
	
	void setCarType(CarType type);
    
	void setSeats(int seats);
    
	void setEngine(Engine engine);
    
	void setTransmission(Transmission transmission);
    
	void setTripComputer(TripComputer tripComputer);
    
	void setGPSNavigator(GPSNavigator gpsNavigator);
}
