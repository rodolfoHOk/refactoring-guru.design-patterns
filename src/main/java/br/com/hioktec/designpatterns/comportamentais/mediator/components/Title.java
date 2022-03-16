package br.com.hioktec.designpatterns.comportamentais.mediator.components;

import java.awt.event.KeyEvent;

import javax.swing.JTextField;

import br.com.hioktec.designpatterns.comportamentais.mediator.mediators.Mediator;

public class Title extends JTextField implements Component {
	
	private static final long serialVersionUID = 1L;
	
	private Mediator mediator;

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void processComponentKeyEvent(KeyEvent keyEvent) {
        mediator.markNote();
    }

    @Override
    public String getName() {
        return "Title";
    }
    
}
