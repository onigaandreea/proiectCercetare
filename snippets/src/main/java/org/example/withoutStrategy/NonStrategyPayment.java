package org.example.withoutStrategy;

// Example without using design pattern
class NonStrategyPayment {
    void payWithCreditCard(int amount) {
        System.out.println("Paid " + amount + " via Credit Card");
    }

    void payWithPayPal(int amount) {
        System.out.println("Paid " + amount + " via PayPal");
    }
}
