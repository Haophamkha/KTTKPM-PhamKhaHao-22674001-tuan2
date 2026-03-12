package org.example.StatePattern;

public class NewState implements OrderState {

    public void handle() {
        System.out.println("Đơn hàng mới: kiểm tra thông tin");
    }
}