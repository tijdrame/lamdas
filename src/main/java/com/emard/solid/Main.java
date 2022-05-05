package com.emard.solid;

import java.util.List;

import lombok.extern.slf4j.Slf4j;
@Slf4j
public class Main {
    public static void main(String[] args) {
        IAreaCalculator areaCalculator = new AreaCalculator();
        IAreaCalculator areaCalculatorV2 = new AreaCalculatorV2();
        ShapesPrinter printer = new ShapesPrinter(areaCalculator);
        Circle circle = new Circle(10);
        Square square = new Square(10);
        NoShape noShape = new NoShape();
        List<Shape> shapes = List.of(circle, square);
        int sum = areaCalculatorV2.sum(shapes);
        log.info("sum = [{}]", sum);
        log.info(printer.json(shapes));
        log.info(printer.csv(shapes));
    }
}
