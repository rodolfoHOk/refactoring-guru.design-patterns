package br.com.hioktec.designpatterns.criacionais.factorymethod.factories;

import br.com.hioktec.designpatterns.criacionais.factorymethod.buttons.Button;
import br.com.hioktec.designpatterns.criacionais.factorymethod.buttons.WindowsButton;

public class WindowsDialog extends Dialog {

	@Override
	public Button createButton() {
		return new WindowsButton();
	}
}
