package org.example.StatePattern;

public class CancelledState implements OrderState {

    public void handle() {
        System.out.println("Đơn hàng bị hủy và hoàn tiền");
    }
}
