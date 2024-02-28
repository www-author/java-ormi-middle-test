package com.middle.test.domain.shape;

public class ShapeAreaApplication {
    public static void main(String[] args) {
        Shape circle = new Circle(5);
        Shape rectangle = new Rectangle(4, 10);
        Shape triangle = new Triangle(5, 3.14);

        circle.getArea();
        rectangle.getArea();
        triangle.getArea();
    }
}
