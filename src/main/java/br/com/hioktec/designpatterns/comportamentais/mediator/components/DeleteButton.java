package br.com.hioktec.designpatterns.comportamentais.mediator.components;

import java.awt.event.ActionEvent;

import javax.swing.JButton;

import br.com.hioktec.designpatterns.comportamentais.mediator.mediators.Mediator;

public class DeleteButton extends JButton implements Component {

	private static final long serialVersionUID = 1L;

	private Mediator mediator;

    public DeleteButton() {
        super("Del");
    }

    @Override
    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    @Override
    protected void fireActionPerformed(ActionEvent actionEvent) {
        mediator.deleteNote();
    }

    @Override
    public String getName() {
        return "DelButton";
    }
    
}
