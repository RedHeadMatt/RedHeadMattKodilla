package com.kodilla.testing.com.kodilla.testing.shape;

import com.kodilla.testing.com.kodilla.testing.com.kodilla.testing.shape.Circle;
import com.kodilla.testing.com.kodilla.testing.com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.com.kodilla.testing.com.kodilla.testing.shape.Square;
import com.kodilla.testing.com.kodilla.testing.com.kodilla.testing.shape.Triangle;
import org.junit.*;

import java.util.Random;

public class ShapeCollectorTestSuite {
    static int testsCounter = 0;


    @BeforeClass
    public static void displayBeforeClass(){
        System.out.println("New class created!");
    }

    @AfterClass
    public static void displayAfterClass(){
        System.out.println("Class is over");
    }

    @Before
    public void displayBeforeEveryTest(){
        testsCounter++;
        System.out.println("Preparing to execute test no. #"+testsCounter);
    }

    @Test
    public void testAddFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Circle circle = new Circle();
        shapeCollector.addFigure(circle);

        Assert.assertEquals(1, shapeCollector.numOfFigures());

    }

    @Test
    public void testRemoveFigure(){
        ShapeCollector shapeCollector = new ShapeCollector();
        Square square = new Square();
        shapeCollector.addFigure(square);
        int numOfFigures = shapeCollector.numOfFigures();
        shapeCollector.removeFigure(square);
        Assert.assertEquals(numOfFigures-1, shapeCollector.numOfFigures());
    }

    @Test
    public void testGetFigure(){
        Random generator = new Random();
        ShapeCollector shapeCollector = new ShapeCollector();
        for (int i = 0; i < 100; i++){
            shapeCollector.addFigure(new Triangle());
        }
        Assert.assertEquals("TRIANGLE", shapeCollector.getFigure(generator.nextInt(99)));
    }

    @Test
    public void testShowFigures(){

        ShapeCollector shapeCollector = new ShapeCollector();
        Triangle triangle = new Triangle();
        Circle circle = new Circle();
        Square square = new Square();

        shapeCollector.addFigure(triangle);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(square);

        Assert.assertEquals("TRIANGLECIRCLESQUARE", shapeCollector.showFigures());
    }

}
