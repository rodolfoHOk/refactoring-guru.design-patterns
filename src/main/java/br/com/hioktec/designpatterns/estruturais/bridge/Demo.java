package br.com.hioktec.designpatterns.estruturais.bridge;

import br.com.hioktec.designpatterns.estruturais.bridge.devices.Device;
import br.com.hioktec.designpatterns.estruturais.bridge.devices.Radio;
import br.com.hioktec.designpatterns.estruturais.bridge.devices.Tv;
import br.com.hioktec.designpatterns.estruturais.bridge.remotes.AdvancedRemote;
import br.com.hioktec.designpatterns.estruturais.bridge.remotes.BasicRemote;

public class Demo {
	public static void main(String[] args) {
        testDevice(new Tv());
        testDevice(new Radio());
    }

    public static void testDevice(Device device) {
        System.out.println("Testes com o Controle Remoto Básico.");
        BasicRemote basicRemote = new BasicRemote(device);
        basicRemote.power();
        device.printStatus();

        System.out.println("Testes com o Controle Remoto Avançado.");
        AdvancedRemote advancedRemote = new AdvancedRemote(device);
        advancedRemote.power();
        advancedRemote.mute();
        device.printStatus();
    }
}
