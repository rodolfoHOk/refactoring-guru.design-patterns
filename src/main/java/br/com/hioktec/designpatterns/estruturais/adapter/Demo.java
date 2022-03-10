package br.com.hioktec.designpatterns.estruturais.adapter;

import br.com.hioktec.designpatterns.estruturais.adapter.adapters.SquarePegAdapter;
import br.com.hioktec.designpatterns.estruturais.adapter.round.RoundHole;
import br.com.hioktec.designpatterns.estruturais.adapter.round.RoundPeg;
import br.com.hioktec.designpatterns.estruturais.adapter.square.SquarePeg;

public class Demo {
	
	 public static void main(String[] args) {
	        // Redondo cabe no redondo, sem surpresa.
	        RoundHole hole = new RoundHole(5);
	        RoundPeg roundPeg = new RoundPeg(5);
	        if (hole.fits(roundPeg)) {
	            System.out.println("Pino redondo de raio 5 cabe no buraco redondo de raio 5.");
	        }

	        SquarePeg smallSqPeg = new SquarePeg(2);
	        SquarePeg largeSqPeg = new SquarePeg(10);
//	        hole.fits(smallSqPeg); // Com esta linha não compila.

	        // Adapter resolve o problema.
	        SquarePegAdapter smallSqPegAdapter = new SquarePegAdapter(smallSqPeg);
	        SquarePegAdapter largeSqPegAdapter = new SquarePegAdapter(largeSqPeg);
	        if (hole.fits(smallSqPegAdapter)) {
	            System.out.println("Pino quadrado com 2 de largura cabe no buraco redondo de raio 5.");
	        }
	        if (!hole.fits(largeSqPegAdapter)) {
	            System.out.println("Pino quadrado com 10 de largura não cabe no buraco redondo de raio 5.");
	        }
	    }
}
