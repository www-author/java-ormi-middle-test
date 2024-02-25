package com.middle.test.domain.shape;

public class Circle implements Shape {

    private final double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public void getArea() {
        System.out.printf("반지름이 %s인 원의 면적은 %.2f입니다.\n", radius, (Math.PI * radius * radius));
    }
}
