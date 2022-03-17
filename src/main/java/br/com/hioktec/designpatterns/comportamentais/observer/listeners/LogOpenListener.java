package br.com.hioktec.designpatterns.comportamentais.observer.listeners;

import java.io.File;

public class LogOpenListener implements EventListener {
	
	private File log;

    public LogOpenListener(String fileName) {
        this.log = new File(fileName);
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("Salvar no log " + log + ": Alguém executou a operação " + eventType + " com o seguinte arquivo: " + file.getName());
    }

}
