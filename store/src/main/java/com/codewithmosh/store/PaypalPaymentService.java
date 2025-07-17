package com.codewithmosh.store;

import org.springframework.stereotype.Component;

@Component("paypal")
public class PaypalPaymentService implements PaymentService{

    @Override
    public void processPayment(double amount) {
        System.out.println("paypal");
        System.out.println("Amount: " + amount +" paid ");
    }
}
