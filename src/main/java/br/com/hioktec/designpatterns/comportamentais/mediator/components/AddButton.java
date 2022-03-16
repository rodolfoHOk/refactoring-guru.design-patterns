package br.com.hioktec.designpatterns.comportamentais.mediator.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import br.com.hioktec.designpatterns.comportamentais.mediator.mediators.Mediator;
import br.com.hioktec.designpatterns.comportamentais.mediator.mediators.Note;

public class AddButton extends JButton implements Component {

	private static final long serialVersionUID = 1L;
	
	private Mediator mediator;

    public AddButton() {
        super("Add");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.addNewNote(new Note());
    }

    @Override
    public String getName() {
        return "AddButton";
    }
    
}
