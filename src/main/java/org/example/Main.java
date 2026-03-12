package org.example;

import org.example.DecoratorPattern.CreditCardPayment;
import org.example.DecoratorPattern.Discount;
import org.example.DecoratorPattern.Payment;
import org.example.DecoratorPattern.ProcessingFee;
import org.example.FactoryPattern.Shape;
import org.example.FactoryPattern.ShapeFactory;
import org.example.SingletonPattern.People;
import org.example.StatePattern.*;
import org.example.StrategyPattern.VatTax;

public class Main {
    public static void main(String[] args) {

        //Singleton
        People p1 = People.getInstance();
        People p2 = People.getInstance();

        p1.log("Bắt đầu");

        System.out.println(p1 == p2);

        //Factory

        Shape shape1 = ShapeFactory.createShape("circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.createShape("rectangle");
        shape2.draw();

        Order order = new Order();

        // State
        order.setState(new NewState());
        order.process();

        order.setState(new ProcessingState());
        order.process();

        // Strategy
        order.setTaxStrategy(new VatTax());
        double price = order.calculatePrice(1000);

        System.out.println("Giá sau thuế: " + price);

        // Decorator
        Payment payment = new CreditCardPayment();
        payment = new ProcessingFee(payment);
        payment = new Discount(payment);

        double finalPrice = payment.pay(price);

        System.out.println("Thanh toán cuối: " + finalPrice);
    }
}