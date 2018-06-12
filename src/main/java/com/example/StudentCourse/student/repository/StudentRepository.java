package com.example.StudentCourse.student.repository;

import com.example.StudentCourse.student.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, String> {

}
