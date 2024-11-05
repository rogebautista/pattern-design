package org.example.structural.adapter;

public interface PaymentProcessor {
    void pay(double amount);
    void refund(String transactionId, double amount);
    String checkStatus(String transactionId);
}
