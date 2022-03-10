package br.com.hioktec.designpatterns.criacionais.singleton.threadsafe;

public class SingletonThreadSafe {
	
	// O campo deve ser declarado volátil para que o bloqueio de verificação dupla funcione corretamente. 
	private static volatile SingletonThreadSafe instance;

    public String value;

    private SingletonThreadSafe(String value) {
        this.value = value;
    }
    
    /** 
	 * A abordagem adotada aqui é chamada de bloqueio de dupla verificação (DCL). Ele existe para evitar a
	 * condição de corrida entre vários threads que podem tentar obter instâncias singleton ao mesmo tempo,
	 * criando instâncias separadas como resultado.
     *
	 * Pode parecer que ter a variável `result` aqui é completamente inútil. Há, no entanto, uma ressalva muito
	 * importante ao implementar o bloqueio de verificação dupla em Java, que é resolvido com a introdução dessa
	 * variável local. 
 	**/
    public static SingletonThreadSafe getInstance(String value) {
    	SingletonThreadSafe result = instance;
        if (result != null) {
            return result;
        }
        synchronized(SingletonThreadSafe.class) {
            if (instance == null) {
                instance = new SingletonThreadSafe(value);
            }
            return instance;
        }
    }
}
