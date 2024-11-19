package org.example.behavior.strategy;

public class StrategyPattern {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();

        cart.addItem(new Item("Laptop", 1000));
        cart.addItem(new Item("Headphones", 100));
        cart.addItem(new Item("Tablet", 800));

        cart.setPaymentStrategy(new CreditCardStrategy("1234-5678-9101-1121", "Profe", "123", "12/24"));
        cart.checkout();
        System.out.println(" ---------------------------- ");
        cart.setPaymentStrategy(new PayPalStrategy("el.profe@example.com", "123456789"));
        cart.checkout();
        System.out.println(" ---------------------------- ");
        cart.setPaymentStrategy(new BitcoinStrategy("1Hc6BX4RR4hs8YQmR3Y7R6U8"));
        cart.checkout();
        System.out.println(" ---------------------------- ");
    }
}

