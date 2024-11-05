package org.example.structural.adapter;

public class PayPalPayment {

    public String makePayment(double amount) {
        System.out.println("Processing PayPal payment of $" + amount);
        String transactionId = "PAYPAL" + System.currentTimeMillis();
        return transactionId;
    }

    public void issueRefund(String transactionId, double amount) {
        System.out.println("Issuing refund of $" + amount + " for PayPal transaction ID: " + transactionId);
    }

    public String getStatus(String transactionId) {
        System.out.println("Retrieving status for PayPal transaction ID: " + transactionId);
        String status = "COMPLETED"; // "PENDING", "COMPLETED", "FAILED"
        return status;
    }
}

