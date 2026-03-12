package org.example.StatePattern;

public class ProcessingState implements OrderState {

    public void handle() {
        System.out.println("Đang xử lý: đóng gói và vận chuyển");
    }
}
