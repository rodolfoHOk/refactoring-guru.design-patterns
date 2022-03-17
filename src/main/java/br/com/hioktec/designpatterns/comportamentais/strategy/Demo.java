package br.com.hioktec.designpatterns.comportamentais.strategy;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;

import br.com.hioktec.designpatterns.comportamentais.strategy.order.Order;
import br.com.hioktec.designpatterns.comportamentais.strategy.strategies.PayByCreditCard;
import br.com.hioktec.designpatterns.comportamentais.strategy.strategies.PayByPayPal;
import br.com.hioktec.designpatterns.comportamentais.strategy.strategies.PayStrategy;

public class Demo {
	
	private static Map<Integer, Integer> priceOnProducts = new HashMap<>();
    private static BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    private static Order order = new Order();
    private static PayStrategy strategy;

    static {
        priceOnProducts.put(1, 2200);
        priceOnProducts.put(2, 1850);
        priceOnProducts.put(3, 1100);
        priceOnProducts.put(4, 890);
    }

    public static void main(String[] args) throws IOException {
        while (!order.isClosed()) {
            int cost;

            String continueChoice;
            do {
                System.out.print("Por favor, selecione um produto:" + "\n" +
                        "1 - Placa-mãe" + "\n" +
                        "2 - CPU - Processador" + "\n" +
                        "3 - HD - Disco Rígido" + "\n" +
                        "4 - Memória RAM" + "\n");
                int choice = Integer.parseInt(reader.readLine());
                cost = priceOnProducts.get(choice);
                System.out.print("Quantidade: ");
                int count = Integer.parseInt(reader.readLine());
                order.setTotalCost(cost * count);
                System.out.print("Você deseja continuar a selecionar produtos? S/N: ");
                continueChoice = reader.readLine();
            } while (continueChoice.equalsIgnoreCase("S"));

            if (strategy == null) {
                System.out.println("Por favor, selecione o método de pagamento:" + "\n" +
                        "1 - PalPay" + "\n" +
                        "2 - Cartão de Crédito");
                String paymentMethod = reader.readLine();

                // Client creates different strategies based on input from user,
                // application configuration, etc.
                if (paymentMethod.equals("1")) {
                    strategy = new PayByPayPal();
                } else {
                    strategy = new PayByCreditCard();
                }
            }

            // Order object delegates gathering payment data to strategy object,
            // since only strategies know what data they need to process a
            // payment.
            order.processOrder(strategy);

            System.out.print("Pagar " + order.getTotalCost() + " reais ou Continuar comprando? P/C: ");
            String proceed = reader.readLine();
            if (proceed.equalsIgnoreCase("P")) {
                // Finally, strategy handles the payment.
                if (strategy.pay(order.getTotalCost())) {
                    System.out.println("Pagamento efetuado com sucesso.");
                } else {
                    System.out.println("Falha! Por Favor, checar seus dados.");
                }
                order.setClosed();
            }
        }
    }
}
