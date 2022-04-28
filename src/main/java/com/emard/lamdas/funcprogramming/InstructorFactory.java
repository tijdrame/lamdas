package com.emard.lamdas.funcprogramming;

import java.util.List;

@FunctionalInterface
public interface InstructorFactory {
    public Instructor getInstructor(String name, int year, String title, String gender, boolean online, List<String> courses) ;
}
