package com.company.chatbot.factory.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service("paypol")
public class PaypolPayment implements PaymentProcessor{
    @Override
    public void processPayment(BigInteger amount) {
        System.out.println("PaypolPayment Done.");
    }

    @Override
    public String getPaymentType() {
        return "Paypol Type.";
    }
}
