package br.com.hioktec.designpatterns.comportamentais.iterator;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import br.com.hioktec.designpatterns.comportamentais.iterator.profile.Profile;
import br.com.hioktec.designpatterns.comportamentais.iterator.socialNetworks.Facebook;
import br.com.hioktec.designpatterns.comportamentais.iterator.socialNetworks.LinkedIn;
import br.com.hioktec.designpatterns.comportamentais.iterator.socialNetworks.SocialNetwork;
import br.com.hioktec.designpatterns.comportamentais.iterator.spammer.SocialSpammer;

public class Demo {
	public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Por favor especifique a rede social alvo da ferramenta de spam (padrão: Facebook):");
        System.out.println("1. Facebook");
        System.out.println("2. LinkedIn");
        String choice = scanner.nextLine();

        SocialNetwork network;
        if (choice.equals("2")) {
            network = new LinkedIn(createTestProfiles());
        }
        else {
            network = new Facebook(createTestProfiles());
        }

        SocialSpammer spammer = new SocialSpammer(network);
        spammer.sendSpamToFriends("anna.smith@bing.com",
                "Olá! Eu sou o amigo de Anna, Josh. Você pode fazer um favor para mim?, dê Like neste post [link]?");
        spammer.sendSpamToCoworkers("anna.smith@bing.com",
                "Olá! Eu sou o chefe da Anna, Jason. Anna me disse que você te, interesse em [link].");
    }

    public static List<Profile> createTestProfiles() {
        List<Profile> data = new ArrayList<Profile>();
        data.add(new Profile("anna.smith@bing.com", "Anna Smith", "friends:mad_max@ya.com", "friends:catwoman@yahoo.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("mad_max@ya.com", "Maximilian", "friends:anna.smith@bing.com", "coworkers:sam@amazon.com"));
        data.add(new Profile("bill@microsoft.eu", "Billie", "coworkers:avanger@ukr.net"));
        data.add(new Profile("avanger@ukr.net", "John Day", "coworkers:bill@microsoft.eu"));
        data.add(new Profile("sam@amazon.com", "Sam Kitting", "coworkers:anna.smith@bing.com", "coworkers:mad_max@ya.com", "friends:catwoman@yahoo.com"));
        data.add(new Profile("catwoman@yahoo.com", "Liza", "friends:anna.smith@bing.com", "friends:sam@amazon.com"));
        return data;
    }
}
