package com.kodilla.testing.com.kodilla.testing.com.kodilla.testing.shape;

public class Triangle implements Shape{

    @Override
    public String getShapeName() {
        return "TRIANGLE";
    }

    @Override
    public double getField(double a, double b) {
        return 0.5*a*b;
    }
}
