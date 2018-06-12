package com.example.StudentCourse.course.repository;

import com.example.StudentCourse.course.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourseRepository extends JpaRepository<Course, String> {

}
