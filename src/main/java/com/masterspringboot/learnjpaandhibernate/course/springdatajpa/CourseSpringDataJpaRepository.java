package com.masterspringboot.learnjpaandhibernate.course.springdatajpa;

import com.masterspringboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
    public List<Course> findCourseByAuthor(String author);
    public List<Course> findCourseByName(String name);
}
