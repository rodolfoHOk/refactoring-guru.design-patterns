package br.com.hioktec.designpatterns.comportamentais.memento.commands;

import java.awt.Color;

import br.com.hioktec.designpatterns.comportamentais.memento.editor.Editor;
import br.com.hioktec.designpatterns.comportamentais.memento.shapes.Shape;

public class ColorCommand implements Command{

	private Editor editor;
    private Color color;

    public ColorCommand(Editor editor, Color color) {
        this.editor = editor;
        this.color = color;
    }

    @Override
    public String getName() {
        return "Colorize: " + color.toString();
    }

    @Override
    public void execute() {
        for (Shape child : editor.getShapes().getSelected()) {
            child.setColor(color);
        }
    }
    
}
