package br.com.hioktec.designpatterns.criacionais.singleton;

import br.com.hioktec.designpatterns.criacionais.singleton.threadsafe.SingletonThreadSafe;

public class DemoMultiThread {
	
	public static void main(String[] args) {
		System.out.println("Se você ver o mesmo valor, o singleton está sendo reusado (correto!)" + "\n" +
	               "Se você ver valores diferentes, há 2 singletons criados (errado!)" + "\n\n" +
	               "RESULTADO:" + "\n");
        
		Thread threadFoo = new Thread(new ThreadFoo());
        Thread threadBar = new Thread(new ThreadBar());
        
        threadFoo.start();
        threadBar.start();
    }

    private static class ThreadFoo implements Runnable {
        @Override
        public void run() {
            SingletonThreadSafe singleton = SingletonThreadSafe.getInstance("Valor1");
            System.out.println(singleton.value);
        }
    }

    private static class ThreadBar implements Runnable {
        @Override
        public void run() {
        	SingletonThreadSafe singleton = SingletonThreadSafe.getInstance("Valor2");
            System.out.println(singleton.value);
        }
    }
}
