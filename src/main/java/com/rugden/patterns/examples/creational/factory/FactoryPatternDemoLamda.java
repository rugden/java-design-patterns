package com.rugden.patterns.examples.creational.factory;

import com.rugden.patterns.examples.creational.factory.ShapeFactoryLambdas.ShapeType;

public class FactoryPatternDemoLamda {


    public static void main(String[] args) {
        //call draw method of circle
        Shape shape1 = ShapeFactoryLambdas.createShape(ShapeType.CIRCLE);
        shape1.draw();

        //call draw method of Rectangle
        Shape shape2 = ShapeFactoryLambdas.createShape(ShapeType.RECTANGLE);
        shape2.draw();
    }
}
