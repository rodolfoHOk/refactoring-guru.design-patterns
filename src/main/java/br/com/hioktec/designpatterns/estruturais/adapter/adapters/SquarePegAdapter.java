package br.com.hioktec.designpatterns.estruturais.adapter.adapters;

import br.com.hioktec.designpatterns.estruturais.adapter.round.RoundPeg;
import br.com.hioktec.designpatterns.estruturais.adapter.square.SquarePeg;

public class SquarePegAdapter extends RoundPeg {
	
	private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg) {
        this.peg = peg;
    }

    @Override
    public double getRadius() {
        double result;
        // Calcula a raio minimo do circulo, que o pino cabe.
        result = (Math.sqrt(Math.pow((peg.getWidth() / 2), 2) * 2));
        return result;
    }
}
