package br.com.hioktec.designpatterns.criacionais.abstractfactory.factories;

import br.com.hioktec.designpatterns.criacionais.abstractfactory.buttons.Button;
import br.com.hioktec.designpatterns.criacionais.abstractfactory.checkboxes.Checkbox;

public interface GUIFactory {
	
	Button createButton();
	
	Checkbox createCheckbox();
}
