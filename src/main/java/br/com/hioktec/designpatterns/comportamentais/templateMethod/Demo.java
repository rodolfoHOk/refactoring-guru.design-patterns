package br.com.hioktec.designpatterns.comportamentais.templateMethod;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import br.com.hioktec.designpatterns.comportamentais.templateMethod.networks.Facebook;
import br.com.hioktec.designpatterns.comportamentais.templateMethod.networks.Network;
import br.com.hioktec.designpatterns.comportamentais.templateMethod.networks.Twitter;

public class Demo {
	
	public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        Network network = null;
        System.out.print("Digite o nome de usuário: ");
        String userName = reader.readLine();
        System.out.print("Digite a senha: ");
        String password = reader.readLine();

        // Enter the message.
        System.out.print("Digite a mensagem: ");
        String message = reader.readLine();

        System.out.println("\nEscolha a rede social para postar a mensagem.\n" +
                "1 - Facebook\n" +
                "2 - Twitter");
        int choice = Integer.parseInt(reader.readLine());

        // Create proper network object and send the message.
        if (choice == 1) {
            network = new Facebook(userName, password);
        } else if (choice == 2) {
            network = new Twitter(userName, password);
        }
        network.post(message);
    }
}
