package com.emard.lamdas.funcprogramming;

import java.util.List;
import java.util.function.BiConsumer;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class BiConsumerExample2 {
    public static void main(String[] args) {
        List<Instructor> instructors = Instructors.getAll();
        BiConsumer<String, String> biConsumer = (name, gender) -> log.info("Name is [{}] and gender is [{}]", name, gender);
        instructors.forEach(i -> biConsumer.accept(i.getName(), i.getGender()));

        BiConsumer<String, List<String>> biConsumer2 = (name, courses) -> log.info("Name is [{}] and courses is [{}]", name, courses);
        instructors.forEach(i -> biConsumer2.accept(i.getName(), i.getCourses()));

        BiConsumer<String, String> biConsumer3 = (name, gender) -> log.info("Name is [{}] and gender is [{}]", name, gender);
        instructors.forEach(i -> { 
            if(i.onlineCourses) biConsumer3.accept(i.getName(), i.getGender() );
        });
    }
}
