package org.example.StatePattern;

import org.example.Order;

public class NewState implements OrderState {

    @Override
    public void handle(Order order) {
        System.out.println("Đơn hàng mới: kiểm tra thông tin");

        order.setState(new ProcessingState());
    }
}