package com.example.StudentCourse.student.service;

import com.example.StudentCourse.student.model.Student;
import com.example.StudentCourse.student.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository studentRepository;

    public List<Student> getAll() {
        return studentRepository.findAll();
    }

    public Student getById(String rollNo) {
        return studentRepository.findById(rollNo).get();
    }

    public void add(Student s) {
        studentRepository.save(s);
    }

    public void delete(String rollNo) {
        studentRepository.deleteById(rollNo);
    }

}
