package br.com.hioktec.designpatterns.comportamentais.mediator.components;

import br.com.hioktec.designpatterns.comportamentais.mediator.mediators.Mediator;

public interface Component {

	void setMediator(Mediator mediator);
    
	String getName();
}
