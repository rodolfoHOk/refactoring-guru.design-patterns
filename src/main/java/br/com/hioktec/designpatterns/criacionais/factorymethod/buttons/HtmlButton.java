package br.com.hioktec.designpatterns.criacionais.factorymethod.buttons;

public class HtmlButton implements Button {

	public void render() {
		System.out.println("<button>Botão de Teste</button>");
		onClick();		
	}

	public void onClick() {
		System.out.println("Click! Botão diz _ Olá Mundo!");		
	}
}
