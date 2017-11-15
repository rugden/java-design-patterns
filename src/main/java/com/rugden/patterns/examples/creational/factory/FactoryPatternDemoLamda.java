package com.rugden.patterns.examples.creational.factory;

import java.util.function.Supplier;

public class FactoryPatternDemoLamda {


    public static void main(String[] args) {
        Supplier<ShapeFactory> shapeFactory = ShapeFactory::new;

        //call draw method of circle
        shapeFactory.get().getShape("circle").draw();

        //call draw method of Rectangle
        shapeFactory.get().getShape("rectangle").draw();
    }
}
