package com.masterspringboot.learnjpaandhibernate.course.jdbc;

import com.masterspringboot.learnjpaandhibernate.course.Course;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseJdbcCommandLineRunner implements CommandLineRunner {

    @Autowired
    private CourseJdbcRepository repository;

    @Override
    public void run(String... args) throws Exception {
        repository.insert(new Course(1, "Learn Spring", "Udemy"));
        repository.insert(new Course(2, "Learn MySql", "YouTube"));
        repository.insert(new Course(3, "Learn SpringBoot", "Udemy"));

        repository.delete(2);

        System.out.println(repository.findById(1));
        System.out.println(repository.findById(3));
    }

}
