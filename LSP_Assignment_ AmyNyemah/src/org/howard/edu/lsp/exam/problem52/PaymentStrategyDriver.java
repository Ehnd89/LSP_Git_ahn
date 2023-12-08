package org.howard.edu.lsp.exam.problem52;

public class PaymentStrategyDriver {
    public static void main(String[] args) {
        // Test Credit Card Payment
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234-5678-9012-3456");
        ShoppingCart cart1 = new ShoppingCart(creditCardPayment);
        cart1.checkout(100.0);

        // Test PayPal Payment
        PaymentStrategy payPalPayment = new PayPalPayment("user@example.com");
        ShoppingCart cart2 = new ShoppingCart(payPalPayment);
        cart2.checkout(50.0);

        // Test Bitcoin Payment
        PaymentStrategy bitcoinPayment = new BitcoinPayment("1AaBbCcDdEeFfGgHh");
        ShoppingCart cart3 = new ShoppingCart(bitcoinPayment);
        cart3.checkout(75.0);
    }
}