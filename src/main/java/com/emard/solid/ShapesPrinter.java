package com.emard.solid;

import java.util.List;

public class ShapesPrinter {
    // Single responsibility: ne pas mettre les print dans area calculator mais ici pour respecter cette règle

    //Dependency Injection use abstract instead of concrete class
    private final IAreaCalculator areaCalculator;
    
    public ShapesPrinter(IAreaCalculator areaCalculator) {
        this.areaCalculator = areaCalculator;
    }

    public String json(List<Shape> shapes) {
        StringBuilder builder = new StringBuilder();
        builder.append("{shapesSum: ");
        builder.append(areaCalculator.sum(shapes));
        builder.append("}");
        return builder.toString();
        //return "{shapesSum: %s}".format(sum);
    }

    public String csv(List<Shape> shapes) {
        StringBuilder builder = new StringBuilder();
        builder.append("shapes_sum,");
        builder.append(areaCalculator.sum(shapes));
        return builder.toString();
        //return "shapes_sum: %s".formatted(sum);
    }
}
