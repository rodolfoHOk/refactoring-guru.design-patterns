package br.com.hioktec.designpatterns.criacionais.prototype;

import java.util.ArrayList;
import java.util.List;

import br.com.hioktec.designpatterns.criacionais.prototype.shapes.Circle;
import br.com.hioktec.designpatterns.criacionais.prototype.shapes.Rectangle;
import br.com.hioktec.designpatterns.criacionais.prototype.shapes.Shape;

public class Demo {

	public static void main(String[] args) {
		
		List<Shape> shapes = new ArrayList<>();
		List<Shape> shapesCopy = new ArrayList<>();
		
		Circle circle = new Circle();
		circle.x = 10;
		circle.y = 20;
		circle.radius = 15;
		circle.color = "red";
		shapes.add(circle);
		
		Circle anotherCircle = (Circle) circle.clone();
		shapes.add(anotherCircle);
		
		Rectangle rectangle = new Rectangle();
		rectangle.width = 10;
		rectangle.height = 20;
		rectangle.color = "blue";
		shapes.add(rectangle);
		
		cloneAndCompare(shapes, shapesCopy);
	}
	
	private static void cloneAndCompare(List<Shape> shapes, List<Shape> shapesCopy) {
		for (Shape shape : shapes) {
			shapesCopy.add(shape.clone());
		}
		
		for (int i = 0; i < shapes.size(); i++) {
			if (shapes.get(i) != shapesCopy.get(i)) {
				System.out.println(i + ": Formas são objetos diferentes, correto");
				if (shapes.get(i).equals(shapesCopy.get(i))) {
					System.out.println(i + ": E são idênticos, correto");
				} else {
					System.out.println(i + ": E não são idênticos, errado");
				}
			} else {
				System.out.println(i + ": Formas são os mesmos objetos, errado");
			}
		}
	}
}
