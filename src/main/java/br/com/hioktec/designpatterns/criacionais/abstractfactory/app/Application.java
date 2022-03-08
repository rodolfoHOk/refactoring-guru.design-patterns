package br.com.hioktec.designpatterns.criacionais.abstractfactory.app;

import br.com.hioktec.designpatterns.criacionais.abstractfactory.buttons.Button;
import br.com.hioktec.designpatterns.criacionais.abstractfactory.checkboxes.Checkbox;
import br.com.hioktec.designpatterns.criacionais.abstractfactory.factories.GUIFactory;

public class Application {
	
	private Button button;
	private Checkbox checkbox;

	public Application(GUIFactory factory) {
		this.button = factory.createButton();
		this.checkbox = factory.createCheckbox();
	}
	
	public void paint() {
		button.paint();
		checkbox.paint();
	}
	
}
