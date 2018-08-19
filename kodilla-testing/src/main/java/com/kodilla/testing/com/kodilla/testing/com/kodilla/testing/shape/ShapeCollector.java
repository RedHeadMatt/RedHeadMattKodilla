package com.kodilla.testing.com.kodilla.testing.com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    List<Shape> theList = new ArrayList<Shape>();

    public void addFigure(Shape shape){
        theList.add(shape);
    }

    public void removeFigure(Shape shape){
        theList.remove(shape);
    }

    public String getFigure(int n){
        if (n < theList.size()) {
            return theList.get(n).getShapeName();
        }
        else{
            return "ERROR! N bigger than ArraySize!";
        }

    }

    public String showFigures(){
        String result = "";
        for (Shape temp: theList) {
            System.out.println(temp.getShapeName());
            result += temp.getShapeName();
            }
            return result;

    }

    public int numOfFigures(){
        return theList.size();
    }
}
