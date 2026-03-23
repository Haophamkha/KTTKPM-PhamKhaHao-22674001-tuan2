package org.example.StatePattern;

import org.example.Order;

public class DeliveredState implements OrderState {

    @Override
    public void handle(Order order) {
        System.out.println("Đã giao hàng");

    }
}