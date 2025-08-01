package com.codewithmosh.store;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component //or service
public class OrderService {

    private PaymentService paymentService;

    public OrderService(){}

    @Autowired
    public OrderService(@Qualifier("stripe") PaymentService paymentService) {
        this.paymentService=paymentService;
    }
    public void placeOrder(){
        //var paymentService=new StripePaymentService();
        paymentService.processPayment(10);
    }

    public void setPaymentService(PaymentService paymentService) {
        this.paymentService = paymentService;
    }

}
