package com.example.StudentCourse.registration.service;

import com.example.StudentCourse.registration.model.StudentCourse;
import com.example.StudentCourse.registration.repository.StudentCourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentCourseService {

    @Autowired
    private StudentCourseRepository studentCourseRepository;

    public List<StudentCourse> getAll() {
        return studentCourseRepository.findAll();
    }

    public StudentCourse getById(String id) {
        return studentCourseRepository.findById(id).get();
    }

    public void add(StudentCourse s) {
        studentCourseRepository.save(s);
    }

    public void delete(String id) {
        studentCourseRepository.deleteById(id);
    }
}
