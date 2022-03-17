package br.com.hioktec.designpatterns.comportamentais.observer.editor;

import java.io.File;

import br.com.hioktec.designpatterns.comportamentais.observer.publisher.EventManager;

public class Editor {
	
	public EventManager events;
    private File file;

    public Editor() {
        this.events = new EventManager("open", "save");
    }

    public void openFile(String filePath) {
        this.file = new File(filePath);
        events.notify("open", file);
    }

    public void saveFile() throws Exception {
        if (this.file != null) {
            events.notify("save", file);
        } else {
            throw new Exception("Por favor abra um arquivo primeiro.");
        }
    }
}
