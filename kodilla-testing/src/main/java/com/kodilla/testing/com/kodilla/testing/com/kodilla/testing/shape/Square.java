package com.kodilla.testing.com.kodilla.testing.com.kodilla.testing.shape;

public class Square implements Shape{
    @Override
    public String getShapeName() {
        return "SQUARE";
    }

    @Override
    public double getField(double a, double b) {
        if (a == b){
            return a*b;
        }
        else{
            return 0;
        }
    }
}
