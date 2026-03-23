package org.example.StatePattern;

import org.example.Order;

public class CancelledState implements OrderState {

    @Override
    public void handle(Order order) {
        System.out.println("Đơn hàng bị hủy và hoàn tiền");
    }
}