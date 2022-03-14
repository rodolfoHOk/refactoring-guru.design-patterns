package br.com.hioktec.designpatterns.estruturais.decorator.decorators;

public interface DataSource {

	void writeData(String data);

    String readData();
    
}
