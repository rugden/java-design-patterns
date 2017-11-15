package com.rugden.patterns.examples.creational.factory;

import java.util.function.Supplier;

public class ShapeFactoryLambdas {

    /**
     * Interface Supplier<T>: This is a functional interface and can
     * therefore be used as the assignment target
     * for a lambda expression or method reference.
     */
    public static enum ShapeType {
        CIRCLE(Circle::new),
        RECTANGLE(Rectangle::new);

        private final Supplier<Shape> constructor;

        ShapeType(Supplier<Shape> constructor) {
            this.constructor = constructor;
        }

        public Supplier<Shape> getConstructor() {
            return constructor;
        }
    }

    public static Shape createShape(ShapeType type) {
        return type.getConstructor().get();
    }
}
