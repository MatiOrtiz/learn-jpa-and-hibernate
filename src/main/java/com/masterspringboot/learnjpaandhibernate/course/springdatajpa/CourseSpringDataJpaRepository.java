package com.masterspringboot.learnjpaandhibernate.course.springdatajpa;

import com.masterspringboot.learnjpaandhibernate.course.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseSpringDataJpaRepository extends JpaRepository<Course, Long> {
}
