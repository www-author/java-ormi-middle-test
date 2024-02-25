package com.middle.test.domain.shape;

public class Triangle implements Shape{
    private final double base;
    private final double altitude;

    public Triangle(double base, double altitude) {
        this.base = base;
        this.altitude = altitude;
    }

    @Override
    public void getArea() {
        System.out.printf("밑변, 높이가 각각 %s, %s인 삼각형의 면적은 %.2f입니다.\n", base, altitude, ((base * altitude) / 2));
    }
}
