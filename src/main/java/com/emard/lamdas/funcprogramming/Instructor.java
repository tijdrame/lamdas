package com.emard.lamdas.funcprogramming;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Instructor {
    String name;
    Integer yearOfExperience;
    String title;
    String gender;
    Boolean onlineCourses;
    List<String> courses;
}
