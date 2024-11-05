package org.example.structural.adapter;

public class PaymentService {
    public static void main(String[] args) {
        PayPalPayment payPalPayment = new PayPalPayment();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalPayment);
        payPalProcessor.pay(100.0);
        payPalProcessor.refund("PAYPAL123", 50.0);
        payPalProcessor.checkStatus("PAYPAL123");

        PaymentProcessor stripeProcessor = new StripeAdapter("sk_test_51PbD0cDrz8z7fqvnXTU4JpAlI9MKHs9izdmEhZuZuUaFLFuERrFWuu3nydDTzmO60gNyabjYeTD6o5Q9HyN3pmIO002E6ckAOL");
        stripeProcessor.pay(200.0);
        stripeProcessor.refund("STRIPE123", 75.0);
        stripeProcessor.checkStatus("STRIPE123");
    }
}
