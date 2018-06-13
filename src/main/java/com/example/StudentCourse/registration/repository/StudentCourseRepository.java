package com.example.StudentCourse.registration.repository;

import com.example.StudentCourse.registration.model.StudentCourse;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentCourseRepository extends JpaRepository<StudentCourse, Long> {

    public List<StudentCourse> findBySId(String sId);
    public List<StudentCourse> findByCId(String cId);
    public boolean existsBySId(String sId);
    public boolean existsByCId(String cId);

}
