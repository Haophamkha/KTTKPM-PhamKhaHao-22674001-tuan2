package org.example.StatePattern;

import org.example.Order;

public class ProcessingState implements OrderState {

    @Override
    public void handle(Order order) {
        System.out.println("Đang xử lý: đóng gói và vận chuyển");

        order.setState(new DeliveredState());
    }
}