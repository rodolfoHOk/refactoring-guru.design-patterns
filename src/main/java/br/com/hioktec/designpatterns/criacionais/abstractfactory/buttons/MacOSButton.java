package br.com.hioktec.designpatterns.criacionais.abstractfactory.buttons;

public class MacOSButton implements Button {

	public void paint() {
		System.out.println("Você criou um MacOSButton");
	}
}
