package com.company.chatbot.factory.service;

import java.math.BigInteger;

public interface PaymentProcessor {
    public void processPayment(BigInteger amount);
    public String getPaymentType();
}
