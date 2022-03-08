package br.com.hioktec.designpatterns.criacionais.abstractfactory.factories;

import br.com.hioktec.designpatterns.criacionais.abstractfactory.buttons.Button;
import br.com.hioktec.designpatterns.criacionais.abstractfactory.buttons.WindowsButton;
import br.com.hioktec.designpatterns.criacionais.abstractfactory.checkboxes.Checkbox;
import br.com.hioktec.designpatterns.criacionais.abstractfactory.checkboxes.WindowsCheckbox;

public class WindowsFactory implements GUIFactory {

	public Button createButton() {
		return new WindowsButton();
	}

	public Checkbox createCheckbox() {
		return new WindowsCheckbox();
	}
	
}
