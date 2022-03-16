package br.com.hioktec.designpatterns.comportamentais.mediator.mediators;

import javax.swing.ListModel;

import br.com.hioktec.designpatterns.comportamentais.mediator.components.Component;

public interface Mediator {

	void addNewNote(Note note);
	
    void deleteNote();
    
    void getInfoFromList(Note note);
    
    void saveChanges();
    
    void markNote();
    
    void clear();
    
    void sendToFilter(ListModel<Note> listModel);
    
	void setElementsList(ListModel<Note> list);
    
    void registerComponent(Component component);
    
    void hideElements(boolean flag);
    
    void createGUI();
}
