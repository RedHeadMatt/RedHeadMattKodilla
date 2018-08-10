package com.kodilla.testing;

import com.kodilla.testing.com.kodilla.testing.user.SImpleUser;

import java.util.Random;

public class TestingMain {

    public static void main(String[] args) {

        SImpleUser user = new SImpleUser("theForumUser");

        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");

        if (user.getUsername().equals("theForumUser")){
            System.out.println("TEST -  OK!");
        }
        else{
            System.out.println("ERROR HAS OCCURED!");
        }

        int numberOfPasses = 1000;
        Random generator = new Random();
        Calculator calculator = new Calculator();
        int numOfPassPositive = 0;
        int numOfPassNegative = 0;

        System.out.println("TESTING WITH RANDOM DOUBLE NUMBERS:");
        System.out.println("NUMBER OF PASSES: "+numberOfPasses);

        for(int i = 0; i < numberOfPasses; i++) {
            double a = generator.nextDouble();
            double b = generator.nextDouble();

            if ((a + b) == calculator.add(a, b) && (a - b) == calculator.substract(a, b)) {
                System.out.println("TEST - OK!");
                numOfPassPositive++;
            } else {
                System.out.println("ERROR HAS OCURED!");
                System.out.println("INPUT A: " + a + " B: " + b);
                numOfPassNegative++;
            }
        }

        System.out.println("TEST REPORT: ");
        System.out.println("POSITIVE PASSES: "+numOfPassPositive);
        System.out.println("NEGATIVE PASSES: "+numOfPassNegative);





    }



}




