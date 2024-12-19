package com.example.paymentservice.paymentgateways;

public interface PaymentGateway {
    public String generatePaymentLink(String email, String phoneNumber, Long amount, String orderId);
}
