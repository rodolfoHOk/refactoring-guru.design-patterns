package br.com.hioktec.designpatterns.comportamentais.iterator.iterators;

import br.com.hioktec.designpatterns.comportamentais.iterator.profile.Profile;

public interface ProfileIterator {
	
	boolean hasNext();

    Profile getNext();

    void reset();
}
