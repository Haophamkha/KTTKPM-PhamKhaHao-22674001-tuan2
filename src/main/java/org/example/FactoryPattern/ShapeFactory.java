package org.example.FactoryPattern;

import org.example.FactoryPattern.Circle;
import org.example.FactoryPattern.Rectangle;
import org.example.FactoryPattern.Shape;

public class ShapeFactory {

    public static Shape createShape(String type) {

        if(type.equalsIgnoreCase("circle")) {
            return new Circle();
        }

        if(type.equalsIgnoreCase("rectangle")) {
            return new Rectangle();
        }

        return null;
    }
}
