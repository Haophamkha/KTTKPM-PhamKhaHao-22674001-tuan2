package org.example.StatePattern;

public class DeliveredState implements OrderState {

    public void handle() {
        System.out.println("Đã giao hàng");
    }
}
