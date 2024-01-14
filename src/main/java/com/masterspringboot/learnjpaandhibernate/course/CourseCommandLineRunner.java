package com.masterspringboot.learnjpaandhibernate.course;

import com.masterspringboot.learnjpaandhibernate.course.Course;
import com.masterspringboot.learnjpaandhibernate.course.jdbc.CourseJdbcRepository;
import com.masterspringboot.learnjpaandhibernate.course.jpa.CourseJpaRepository;
import com.masterspringboot.learnjpaandhibernate.course.springdatajpa.CourseSpringDataJpaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class CourseCommandLineRunner implements CommandLineRunner {

    @Autowired
    //private CourseJdbcRepository repository;
    //private CourseJpaRepository repository;
    private CourseSpringDataJpaRepository repository;

    @Override
    public void run(String... args) throws Exception {
       /*
        repository.insert(new Course(1, "Learn Spring", "Udemy"));
        repository.insert(new Course(2, "Learn MySql", "YouTube"));
        repository.insert(new Course(3, "Learn SpringBoot", "Udemy"));

        repository.delete(2);

        System.out.println(repository.findById(1));
        System.out.println(repository.findById(3));
        */

        repository.save(new Course(1, "Learn Spring", "Udemy"));
        repository.save(new Course(2, "Learn MySql", "YouTube"));
        repository.save(new Course(3, "Learn SpringBoot", "Udemy"));

        repository.deleteById(2l);

        System.out.println(repository.findById(1l));
        System.out.println(repository.findById(3l));
    }

}
