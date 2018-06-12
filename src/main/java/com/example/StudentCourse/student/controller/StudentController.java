package com.example.StudentCourse.student.controller;

import com.example.StudentCourse.student.model.Student;
import com.example.StudentCourse.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @RequestMapping("students")
    public List<Student> getAll() {
        return studentService.getAll();
    }

    @RequestMapping("students/{rollNo}")
    public Student getById(@PathVariable String rollNo) {
        return studentService.getById(rollNo);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/students")
    public void add(@RequestBody Student s){
        studentService.add(s);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/students/{rollNo}")
    public void update(@PathVariable String rollNo,@RequestBody Student s){
        studentService.add(s);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/students/{rollNo}")
    public void delete(@PathVariable String rollNo){
        studentService.delete(rollNo);
    }
}
