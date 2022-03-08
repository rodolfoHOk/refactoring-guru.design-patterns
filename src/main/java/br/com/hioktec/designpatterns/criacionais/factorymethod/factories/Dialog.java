package br.com.hioktec.designpatterns.criacionais.factorymethod.factories;

import br.com.hioktec.designpatterns.criacionais.factorymethod.buttons.Button;

public abstract class Dialog {
	
	public void renderWindow() {
		// ...
		Button okButton = createButton();
		okButton.render();
	}
	
	public abstract Button createButton();
	
}
