package com.emard.lamdas.funcprogramming;

import java.util.List;
import java.util.function.IntConsumer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class VariableScope {
    static Integer k=0;

    public static void main(String[] args) {
        Integer b = 10;
        IntConsumer intConsumer = a -> log.info("{}", a * 10);

        //Integer k = 0;
        List<Instructor> instructors = Instructors.getAll();
        instructors.forEach(instructor -> {
            System.out.println(instructor + " " +  k);
        });
        k++;  // possible car var classe de type static
    }
}
