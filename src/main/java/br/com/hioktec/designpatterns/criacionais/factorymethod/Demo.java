package br.com.hioktec.designpatterns.criacionais.factorymethod;

import br.com.hioktec.designpatterns.criacionais.factorymethod.factories.Dialog;
import br.com.hioktec.designpatterns.criacionais.factorymethod.factories.HtmlDialog;
import br.com.hioktec.designpatterns.criacionais.factorymethod.factories.WindowsDialog;

public class Demo {
	
	private static Dialog dialog;
	
	public static void main(String[] args) {
		configure();
		runBusinessLogic();
	}
	
	private static void configure() {
		if (System.getProperty("os.name").equals("Windows 10")) {
			dialog = new WindowsDialog();
		} else {
			dialog = new HtmlDialog();
		}
	}
	
	private static void runBusinessLogic() {
		dialog.renderWindow();
	}
}
