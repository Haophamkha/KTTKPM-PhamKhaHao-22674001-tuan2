package org.example.DecoratorPattern;

public class ProcessingFee extends PaymentDecorator {

    public ProcessingFee(Payment payment) {
        super(payment);
    }

    public double pay(double amount) {

        double total = payment.pay(amount);

        System.out.println("Phí xử lý 10%");
        return total * 1.1;
    }
}