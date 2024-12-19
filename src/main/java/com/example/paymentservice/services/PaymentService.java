package com.example.paymentservice.services;

import com.example.paymentservice.paymentgateways.PaymentGateway;
import org.springframework.stereotype.Service;

@Service
public class PaymentService {

    private PaymentGateway paymentGateway;

    public PaymentService(PaymentGateway paymentGateway) {
        this.paymentGateway = paymentGateway;
    }

    public String initiatePayment(String email, String phoneNumber, Long amount, String orderId) {
        /*
            1. Call Order Service
            2. Get Order details
            3. Verify Amount
            4. Call Payment Gateway to get payment link
            5. Return Payment link
         */
        return paymentGateway.generatePaymentLink(email, phoneNumber, amount, orderId);
    }
}
