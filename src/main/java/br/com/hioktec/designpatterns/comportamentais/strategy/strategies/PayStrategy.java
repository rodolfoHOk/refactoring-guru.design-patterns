package br.com.hioktec.designpatterns.comportamentais.strategy.strategies;

public interface PayStrategy {

	boolean pay(int paymentAmount);
	
    void collectPaymentDetails();
}
