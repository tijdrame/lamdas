package com.emard.solid;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
@AllArgsConstructor
public class Square implements Shape{
    private final int length;

    @Override
    public double area() {
        return Math.pow(getLength(), 2);
    }
}
