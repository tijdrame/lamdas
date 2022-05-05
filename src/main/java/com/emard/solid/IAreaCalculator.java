package com.emard.solid;

import java.util.List;

public interface IAreaCalculator {
    //pour le pattern injection de dependance use interface (abstraction) instead of class
    int sum(List<Shape> shapes);
}
