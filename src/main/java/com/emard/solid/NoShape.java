package com.emard.solid;

public class NoShape implements Shape {

    @Override
    public double area() {
        throw new IllegalStateException("cannot calculate area");
    }
    
}
