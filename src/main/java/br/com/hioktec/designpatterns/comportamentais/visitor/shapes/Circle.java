package br.com.hioktec.designpatterns.comportamentais.visitor.shapes;

import br.com.hioktec.designpatterns.comportamentais.visitor.visitor.Visitor;

public class Circle extends Dot {

	private int radius;

    public Circle(int id, int x, int y, int radius) {
        super(id, x, y);
        this.radius = radius;
    }
    
    @Override
    public String accept(Visitor visitor) {
        return visitor.visitCircle(this);
    }

    public int getRadius() {
        return radius;
    }
}
