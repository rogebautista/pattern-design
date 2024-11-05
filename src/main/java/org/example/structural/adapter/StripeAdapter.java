package org.example.structural.adapter;

import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.PaymentIntent;

import java.util.HashMap;
import java.util.Map;

public class StripeAdapter implements PaymentProcessor {
    public StripeAdapter(String apiKey) {
        Stripe.apiKey = apiKey;
    }

    @Override
    public void pay(double amount) {
        Map<String, Object> params = new HashMap<>();
        params.put("amount", (int) (amount * 100)); // Amount in cents
        params.put("currency", "usd");

        try {
            PaymentIntent paymentIntent = PaymentIntent.create(params);
            System.out.println("Processed payment of $" + amount + " through Stripe. Transaction ID: " + paymentIntent.getId());
        } catch (StripeException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void refund(String transactionId, double amount) {
        System.out.println("Refunded $" + amount + " through Stripe for Transaction ID: " + transactionId);
    }

    @Override
    public String checkStatus(String transactionId) {
        System.out.println("Checked status of Stripe transaction " + transactionId);
        return "Status for Stripe transaction " + transactionId;
    }
}
