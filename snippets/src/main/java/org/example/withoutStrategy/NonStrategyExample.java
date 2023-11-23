package org.example.withoutStrategy;

public class NonStrategyExample {
    public static void main(String[] args) {
        NonStrategyPayment payment = new NonStrategyPayment();

        payment.payWithCreditCard(100);
        payment.payWithPayPal(50);
    }
}
