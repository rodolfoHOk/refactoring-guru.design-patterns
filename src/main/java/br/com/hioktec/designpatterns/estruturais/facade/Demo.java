package br.com.hioktec.designpatterns.estruturais.facade;

import java.io.File;

import br.com.hioktec.designpatterns.estruturais.facade.facade.VideoConversionFacade;

public class Demo {

	public static void main(String[] args) {
        VideoConversionFacade converter = new VideoConversionFacade();
        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        
        mp4Video.exists();
    }
	
}
