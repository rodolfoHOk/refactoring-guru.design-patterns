package br.com.hioktec.designpatterns.criacionais.abstractfactory.factories;

import br.com.hioktec.designpatterns.criacionais.abstractfactory.buttons.Button;
import br.com.hioktec.designpatterns.criacionais.abstractfactory.buttons.MacOSButton;
import br.com.hioktec.designpatterns.criacionais.abstractfactory.checkboxes.Checkbox;
import br.com.hioktec.designpatterns.criacionais.abstractfactory.checkboxes.MacOSCheckbox;

public class MacOsFactory implements GUIFactory {

	public Button createButton() {
		return new MacOSButton();
	}

	public Checkbox createCheckbox() {
		return new MacOSCheckbox();
	}

}
