package com.middle.test.domain.shape;

public class Rectangle implements Shape {
    private final double width;
    private final double height;

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public void getArea() {
        System.out.printf("가로, 세로 길이가 각각 %s, %s인 직사각형의 넓이는 %.2f입니다.\n", width, height, (width * height));
    }
}
