package br.com.hioktec.designpatterns.comportamentais.iterator.socialNetworks;

import java.util.ArrayList;
import java.util.List;

import br.com.hioktec.designpatterns.comportamentais.iterator.iterators.FacebookIterator;
import br.com.hioktec.designpatterns.comportamentais.iterator.iterators.ProfileIterator;
import br.com.hioktec.designpatterns.comportamentais.iterator.profile.Profile;

public class Facebook implements SocialNetwork {
	
	private List<Profile> profiles;

    public Facebook(List<Profile> cache) {
        if (cache != null) {
            this.profiles = cache;
        } else {
            this.profiles = new ArrayList<>();
        }
    }

    public Profile requestProfileFromFacebook(String profileEmail) {
        // Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();
        System.out.println("Facebook: Carregando profile '" + profileEmail + "' através da rede...");

        // ...and return test data.
        return findProfile(profileEmail);
    }

    public List<String> requestProfileFriendsFromFacebook(String profileEmail, String contactType) {
        // Here would be a POST request to one of the Facebook API endpoints.
        // Instead, we emulates long network connection, which you would expect
        // in the real life...
        simulateNetworkLatency();
        if (contactType.equals("friends")) {
        	System.out.println("Facebook: Carregando lista de amigos de " + profileEmail + "' através da rede...");
        } else {
        	System.out.println("Facebook: Carregando lista de colaboradores de " + profileEmail + "' através da rede...");
        }

        // ...and return test data.
        Profile profile = findProfile(profileEmail);
        if (profile != null) {
            return profile.getContacts(contactType);
        }
        return null;
    }

    private Profile findProfile(String profileEmail) {
        for (Profile profile : profiles) {
            if (profile.getEmail().equals(profileEmail)) {
                return profile;
            }
        }
        return null;
    }

    private void simulateNetworkLatency() {
        try {
            Thread.sleep(2500);
        } catch (InterruptedException ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public ProfileIterator createFriendsIterator(String profileEmail) {
        return new FacebookIterator(this, "friends", profileEmail);
    }

    @Override
    public ProfileIterator createCoworkersIterator(String profileEmail) {
        return new FacebookIterator(this, "coworkers", profileEmail);
    }
    
}
