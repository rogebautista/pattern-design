package org.example.structural.adapter;

public class PayPalAdapter implements PaymentProcessor{
    private PayPalPayment payPalPayment;
    public PayPalAdapter(PayPalPayment payPalPayment) {
        this.payPalPayment = payPalPayment;
    }
    @Override
    public void pay(double amount) {
        String transactionId = payPalPayment.makePayment(amount);
        System.out.println("Processed payment of $" + amount + " through PayPal with Transaction ID: " + transactionId);
    }

    @Override
    public void refund(String transactionId, double amount) {
        payPalPayment.issueRefund(transactionId, amount);
        System.out.println("Refunded $" + amount + " through PayPal for Transaction ID: " + transactionId);
    }

    @Override
    public String checkStatus(String transactionId) {
        String status = payPalPayment.getStatus(transactionId);
        System.out.println("Status of PayPal transaction " + transactionId + ": " + status);
        return status;
    }
}
