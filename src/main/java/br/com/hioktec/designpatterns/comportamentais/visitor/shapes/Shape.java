package br.com.hioktec.designpatterns.comportamentais.visitor.shapes;

import br.com.hioktec.designpatterns.comportamentais.visitor.visitor.Visitor;

public interface Shape {

	void move(int x, int y);
	
    void draw();
    
    String accept(Visitor visitor);
}
