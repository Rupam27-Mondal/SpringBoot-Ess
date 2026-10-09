package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class PaymentService {
    @Autowired
    private OrderService a;

    public PaymentService(){
        System.out.println("B created");
    }
}
