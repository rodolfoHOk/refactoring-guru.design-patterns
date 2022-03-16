package br.com.hioktec.designpatterns.comportamentais.iterator.socialNetworks;

import br.com.hioktec.designpatterns.comportamentais.iterator.iterators.ProfileIterator;

public interface SocialNetwork {

	ProfileIterator createFriendsIterator(String profileEmail);

    ProfileIterator createCoworkersIterator(String profileEmail);
    
}
