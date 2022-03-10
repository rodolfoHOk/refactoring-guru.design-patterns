package br.com.hioktec.designpatterns.estruturais.bridge.remotes;

import br.com.hioktec.designpatterns.estruturais.bridge.devices.Device;

public class AdvancedRemote extends BasicRemote{
	
	public AdvancedRemote(Device device) {
        super.device = device;
    }

    public void mute() {
        System.out.println("Controle Remoto: Mudo");
        device.setVolume(0);
    }
    
}
