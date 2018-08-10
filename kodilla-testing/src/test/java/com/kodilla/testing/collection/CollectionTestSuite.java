package com.kodilla.testing.collection;

import com.kodilla.testing.com.kodilla.testing.collection.OddNumbersExterminator;
import org.junit.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CollectionTestSuite {

    @Before
    public void displayStartOfTests(){
        System.out.println("START!");
    }

    @BeforeClass
    public static void displayStartOfClass(){
        System.out.println("START CLASS!");
    }

    @After
    public void displayEndOfTests(){
        System.out.println("STOP!");
    }

    @AfterClass
    public static void displayEndOfClass(){
        System.out.println("STOP CLASS!");
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){

        List<Integer> emptyList = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();

        OddNumbersExterminator test = new OddNumbersExterminator();

        result = test.exterminate(emptyList);

        Assert.assertEquals(0, result.size());

    }

    @Test
    public void testOddNumbersExterminatorNormalList(){

        List<Integer> oddList = new ArrayList<Integer>();
        List<Integer> result = new ArrayList<Integer>();
        Random generator = new Random();

        while (oddList.size() < 100){
            int a = generator.nextInt();
            if(!(a % 2 == 0)){
                oddList.add(a);
            }
        }
        OddNumbersExterminator test = new OddNumbersExterminator();
        result = test.exterminate(oddList);


        Assert.assertEquals(0, result.size() );



    }
}
