package org.example;

public class Main {
    public static void main(String[] args) {

        //Singleton
        Logger log1 = Logger.getInstance();
        Logger log2 = Logger.getInstance();

        log1.log("Start program");

        System.out.println(log1 == log2);

        //Factory

        Shape shape1 = ShapeFactory.createShape("circle");
        shape1.draw();

        Shape shape2 = ShapeFactory.createShape("rectangle");
        shape2.draw();
    }
}