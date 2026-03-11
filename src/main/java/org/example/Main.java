package org.example;

import org.example.FactoryPattern.Shape;
import org.example.FactoryPattern.ShapeFactory;
import org.example.SingletonPattern.People;

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
    }
}