package org.example.DecoratorPattern;

public class CreditCardPayment implements Payment {

    public double pay(double amount) {
        System.out.println("Thanh toán bằng Credit Card");
        return amount;
    }
}
