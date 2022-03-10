package br.com.hioktec.designpatterns.estruturais.bridge.remotes;

import br.com.hioktec.designpatterns.estruturais.bridge.devices.Device;

public class BasicRemote implements Remote {

	protected Device device;

    public BasicRemote() {}

    public BasicRemote(Device device) {
        this.device = device;
    }

    @Override
    public void power() {
        System.out.println("Controle Remoto: Power pressionado");
        if (device.isEnabled()) {
            device.disable();
        } else {
            device.enable();
        }
    }

    @Override
    public void volumeDown() {
        System.out.println("Controle Remoto: Volume -");
        device.setVolume(device.getVolume() - 10);
    }

    @Override
    public void volumeUp() {
        System.out.println("Controle Remoto: Volume +");
        device.setVolume(device.getVolume() + 10);
    }

    @Override
    public void channelDown() {
        System.out.println("Controle Remoto: Canal -");
        device.setChannel(device.getChannel() - 1);
    }

    @Override
    public void channelUp() {
        System.out.println("Controle Remoto: Canal +");
        device.setChannel(device.getChannel() + 1);
    }
    
}
