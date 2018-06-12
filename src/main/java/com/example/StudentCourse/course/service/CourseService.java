package com.example.StudentCourse.course.service;

import com.example.StudentCourse.course.model.Course;
import com.example.StudentCourse.course.repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CourseService {

    @Autowired
    private CourseRepository courseRepository;

    public List<Course> getAll() {
        return courseRepository.findAll();
    }

    public Course getById(String id) {
        return courseRepository.findById(id).get();
    }

    public void add(Course s) {
        courseRepository.save(s);
    }

    public void delete(String id) {
        courseRepository.deleteById(id);
    }

}
