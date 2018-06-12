package com.example.StudentCourse.registration.repository;

import com.example.StudentCourse.registration.model.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, String> {

}
