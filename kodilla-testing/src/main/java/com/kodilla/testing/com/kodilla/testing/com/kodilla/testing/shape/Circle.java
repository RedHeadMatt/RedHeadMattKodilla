package com.kodilla.testing.com.kodilla.testing.com.kodilla.testing.shape;

import java.math.*;

public class Circle implements Shape {

    @Override
    public String getShapeName() {
        return "CIRCLE";
    }

    @Override
    public double getField(double a, double b) {

        if (a == 0){
            return Math.PI*Math.pow(b, 2);
        }
        else if (b == 0){
            return Math.PI*Math.pow(a, 2);
        }
        else{
            return 0;
        }
    }
}
