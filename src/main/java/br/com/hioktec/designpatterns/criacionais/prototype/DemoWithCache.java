package br.com.hioktec.designpatterns.criacionais.prototype;

import br.com.hioktec.designpatterns.criacionais.prototype.caching.BundledShapeCache;
import br.com.hioktec.designpatterns.criacionais.prototype.shapes.Shape;

public class DemoWithCache {
	
	public static void main(String[] args) {
		
		BundledShapeCache cache = new BundledShapeCache();
		
		Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");
        
        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle (correto!)");
        } else {
            System.out.println("Big green circle == Medium blue rectangle (errado!)");
        }

        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles são dois objetos diferentes (correto!)");
            if (shape2.equals(shape3)) {
                System.out.println("E são idênticos (correto!)");
            } else {
                System.out.println("Mas não são idênticos (errado!)");
            }
        } else {
            System.out.println("Objetos retângulos são o mesmo objeto (errado!)");
        }
	}
}
