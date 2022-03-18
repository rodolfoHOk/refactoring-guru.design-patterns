package br.com.hioktec.designpatterns.comportamentais.visitor.visitor;

import br.com.hioktec.designpatterns.comportamentais.visitor.shapes.Circle;
import br.com.hioktec.designpatterns.comportamentais.visitor.shapes.CompoundShape;
import br.com.hioktec.designpatterns.comportamentais.visitor.shapes.Dot;
import br.com.hioktec.designpatterns.comportamentais.visitor.shapes.Rectangle;

public interface Visitor {

	String visitDot(Dot dot);

    String visitCircle(Circle circle);

    String visitRectangle(Rectangle rectangle);

    String visitCompoundGraphic(CompoundShape cg);
    
}
