package org.example.DecoratorPattern;

public class Discount extends PaymentDecorator {

    public Discount(Payment payment) {
        super(payment);
    }

    public double pay(double amount) {

        double total = payment.pay(amount);

        System.out.println("Giảm giá 5%");
        return total * 0.95;
    }
}
