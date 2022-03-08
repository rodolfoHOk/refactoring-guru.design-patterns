package br.com.hioktec.designpatterns.criacionais.abstractfactory.buttons;

public class WindowsButton implements Button {

	public void paint() {
		System.out.println("Você criou um WindowsButton");
	}
}
