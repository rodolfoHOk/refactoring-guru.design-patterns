package br.com.hioktec.designpatterns.comportamentais.observer.listeners;

import java.io.File;

public class EmailNotificationListener implements EventListener {

	private String email;

    public EmailNotificationListener(String email) {
        this.email = email;
    }

    @Override
    public void update(String eventType, File file) {
        System.out.println("E-mail para " + email + ": Alguém executou a operação " + eventType + " com o seguinte arquivo: " + file.getName());
    }
    
}
