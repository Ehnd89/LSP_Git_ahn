package org.howard.edu.lsp.exam.problem52;

public class BitcoinPayment implements PaymentStrategy {
    private String bitcoin;

    public BitcoinPayment(String bitcoin) {
        this.bitcoin = bitcoin;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using Bitcoin address " + bitcoin);
    }
}