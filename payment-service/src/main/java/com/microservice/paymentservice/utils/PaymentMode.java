package com.microservice.paymentservice.utils;

public class PaymentMode {
    private String name;

    public PaymentMode(String paymentMode) {
        this.name=paymentMode;
    }

    public static PaymentMode valueOf(String paymentMode) {
        return new PaymentMode(paymentMode);
    }

    public String name() {
        return this.name;
    }
}
