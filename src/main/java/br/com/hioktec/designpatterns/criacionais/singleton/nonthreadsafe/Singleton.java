package br.com.hioktec.designpatterns.criacionais.singleton.nonthreadsafe;

public class Singleton {
	
	private static Singleton instance;
    
	public String value;
	
	private Singleton(String value) {
		
        // O trecho de código abaixo emula uma inicialização lenta.
        try {
            Thread.sleep(1000);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
        
        this.value = value;
    }
	
	public static Singleton getInstance(String value) {
        if (instance == null) {
            instance = new Singleton(value);
        }
        return instance;
    }
}
