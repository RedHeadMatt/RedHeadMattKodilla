package com.kodilla.testing.com.kodilla.testing.com.kodilla.testing.calculator;

public class TestingMain {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        double a = 15;
        double b = 3;

        if (calculator.add(a,b) == 18 && calculator.substract(a,b) == 12){
            System.out.println("TESTS PASSED!");
        }
        else {
            System.out.println("TESTS FAILED");
        }


    }



}




