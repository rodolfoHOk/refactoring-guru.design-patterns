package br.com.hioktec.designpatterns.comportamentais.state;

import br.com.hioktec.designpatterns.comportamentais.state.ui.Player;
import br.com.hioktec.designpatterns.comportamentais.state.ui.UI;

public class Demo {
	
	public static void main(String[] args) {
        Player player = new Player();
        UI ui = new UI(player);
        ui.init();
    }
}
