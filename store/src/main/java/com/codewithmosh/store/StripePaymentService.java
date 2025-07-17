package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("stripe")
@Primary
public class StripePaymentService implements PaymentService {

    @Value("${stripe.apiurl}")
    private String apiurl;

    @Value("${stripe.test}")
    private String test;

    @Value("${stripe.supported-currency}")
    private List<String> supportedcurrency;

    @Override
    public void processPayment(double amount){
        System.out.println("stripe");
        System.out.println(supportedcurrency);
        System.out.println(apiurl);
        System.out.println(test);
        System.out.println("Amount: " + amount +" paid ");
    }
}
