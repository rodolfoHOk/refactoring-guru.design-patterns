package br.com.hioktec.designpatterns.comportamentais.iterator.spammer;

import br.com.hioktec.designpatterns.comportamentais.iterator.iterators.ProfileIterator;
import br.com.hioktec.designpatterns.comportamentais.iterator.profile.Profile;
import br.com.hioktec.designpatterns.comportamentais.iterator.socialNetworks.SocialNetwork;

public class SocialSpammer {
	
	public SocialNetwork network;
    public ProfileIterator iterator;

    public SocialSpammer(SocialNetwork network) {
        this.network = network;
    }

    public void sendSpamToFriends(String profileEmail, String message) {
        System.out.println("\nIterando sobre dos amigos...\n");
        iterator = network.createFriendsIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendSpamToCoworkers(String profileEmail, String message) {
        System.out.println("\nIterando sobre os colaboradores...\n");
        iterator = network.createCoworkersIterator(profileEmail);
        while (iterator.hasNext()) {
            Profile profile = iterator.getNext();
            sendMessage(profile.getEmail(), message);
        }
    }

    public void sendMessage(String email, String message) {
        System.out.println("Mandando mensagem para: '" + email + "'. Corpo da mensagem: '" + message + "'");
    }
    
}
