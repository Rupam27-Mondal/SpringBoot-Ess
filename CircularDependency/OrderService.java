package org.example;

import org.springframework.beans.factory.annotation.Autowired;

public class OrderService {

    @Autowired
    private PaymentService b;

    public OrderService(){
        System.out.println("A created");
        PaymentService b = new PaymentService();
    }

}
