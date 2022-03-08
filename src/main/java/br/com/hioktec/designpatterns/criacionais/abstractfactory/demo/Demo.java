package br.com.hioktec.designpatterns.criacionais.abstractfactory.demo;

import br.com.hioktec.designpatterns.criacionais.abstractfactory.app.Application;
import br.com.hioktec.designpatterns.criacionais.abstractfactory.factories.GUIFactory;
import br.com.hioktec.designpatterns.criacionais.abstractfactory.factories.MacOsFactory;
import br.com.hioktec.designpatterns.criacionais.abstractfactory.factories.WindowsFactory;

public class Demo {
	
	public static void main(String[] args) {
		Application app = configureApplication();
		app.paint();		
	}
	
	private static Application configureApplication() {
		Application app;
		GUIFactory factory;
		String osName = System.getProperty("os.name").toLowerCase();
		if (osName.contains("mac")) {
			factory = new MacOsFactory();
			app = new Application(factory);
		} else {
			factory = new WindowsFactory();
			app = new Application(factory);
		}
		return app;
	}
}
