package com.emard.solid;

import java.util.List;

public class AreaCalculatorV2 implements IAreaCalculator{
    
    public int sum(List<Shape> shapes) {
        int sum = 0;
        for (int i = 0; i < shapes.size(); i++) {
            //Open Close au lieu des if instance of utiliser interface
            Shape shape = shapes.get(i);
            sum += shape.area();
        }
        return sum;
    }
}
