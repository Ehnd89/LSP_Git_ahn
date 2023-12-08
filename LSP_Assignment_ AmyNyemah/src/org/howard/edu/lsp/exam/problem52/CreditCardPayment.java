package org.howard.edu.lsp.exam.problem52;

public class CreditCardPayment implements PaymentStrategy {
    private String ccNumber;

    public CreditCardPayment(String ccNumber) {
        this.ccNumber = ccNumber;
    }

    @Override
    public void pay(double amount) {
        System.out.println("Paid " + amount + " using credit card " + ccNumber);
    }
}