package com.middle.test.domain.shape;

public class ShapeAreaApplication {
    public static void main(String[] args) {
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 10);
        Triangle triangle = new Triangle(5, 3.14);

        circle.getArea();
        rectangle.getArea();
        triangle.getArea();
    }
}
