package com.company.chatbot.factory.service;

import org.springframework.stereotype.Service;

import java.math.BigInteger;

@Service("credit")
public class CreditCardPayment implements PaymentProcessor{
    @Override
    public void processPayment(BigInteger amount) {
        System.out.println("CreditCardPayment Done.");
    }

    @Override
    public String getPaymentType() {
        return "Credit Type";
    }
}
