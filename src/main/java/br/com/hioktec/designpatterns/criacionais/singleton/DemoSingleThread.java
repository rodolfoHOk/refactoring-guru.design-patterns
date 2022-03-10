package br.com.hioktec.designpatterns.criacionais.singleton;

import br.com.hioktec.designpatterns.criacionais.singleton.nonthreadsafe.Singleton;

public class DemoSingleThread {
	
	public static void main(String[] args) {
        System.out.println("Se você ver o mesmo valor, o singleton está sendo reusado (correto!)" + "\n" +
                "Se você ver valores diferentes, há 2 singletons criados (errado!)" + "\n\n" +
                "RESULTADO:" + "\n");
        
        Singleton singleton = Singleton.getInstance("Valor1");
        Singleton anotherSingleton = Singleton.getInstance("Valor2");
        
        System.out.println(singleton.value);
        System.out.println(anotherSingleton.value);
    }

}
