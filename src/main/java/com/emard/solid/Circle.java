package com.emard.solid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Circle implements Shape{
    private final int radius;

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }
}
