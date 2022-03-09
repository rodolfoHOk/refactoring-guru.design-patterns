package br.com.hioktec.designpatterns.criacionais.builder;

import br.com.hioktec.designpatterns.criacionais.builder.builders.CarBuilder;
import br.com.hioktec.designpatterns.criacionais.builder.builders.CarManualBuilder;
import br.com.hioktec.designpatterns.criacionais.builder.cars.Car;
import br.com.hioktec.designpatterns.criacionais.builder.cars.Manual;
import br.com.hioktec.designpatterns.criacionais.builder.director.Director;

public class Demo {
	
	public static void main(String[] args) {
		
		Director director = new Director();
		CarBuilder builder = new CarBuilder();
		director.constructSportsCar(builder);
		Car car = builder.getResult();
		System.out.println("Carro construido: \n" + car.getCarType());
		
		CarManualBuilder manualBuilder = new CarManualBuilder();
		director.constructSportsCar(manualBuilder);
		Manual manual = manualBuilder.getResult();
		System.out.println("Manual do carro construido: \n" + manual.print());
		
	}
}
