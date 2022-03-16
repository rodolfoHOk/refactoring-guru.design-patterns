package br.com.hioktec.designpatterns.comportamentais.mediator;

import javax.swing.DefaultListModel;

import br.com.hioktec.designpatterns.comportamentais.mediator.components.AddButton;
import br.com.hioktec.designpatterns.comportamentais.mediator.components.DeleteButton;
import br.com.hioktec.designpatterns.comportamentais.mediator.components.Filter;
import br.com.hioktec.designpatterns.comportamentais.mediator.components.List;
import br.com.hioktec.designpatterns.comportamentais.mediator.components.SaveButton;
import br.com.hioktec.designpatterns.comportamentais.mediator.components.TextBox;
import br.com.hioktec.designpatterns.comportamentais.mediator.components.Title;
import br.com.hioktec.designpatterns.comportamentais.mediator.mediators.Editor;
import br.com.hioktec.designpatterns.comportamentais.mediator.mediators.Mediator;
import br.com.hioktec.designpatterns.comportamentais.mediator.mediators.Note;

public class Demo {

	public static void main(String[] args) {
        Mediator mediator = new Editor();

        mediator.registerComponent(new Title());
        mediator.registerComponent(new TextBox());
        mediator.registerComponent(new AddButton());
        mediator.registerComponent(new DeleteButton());
        mediator.registerComponent(new SaveButton());
        mediator.registerComponent(new List(new DefaultListModel<Note>()));
        mediator.registerComponent(new Filter());

        mediator.createGUI();
    }
}
