package com.example.StudentCourse.registration.controller;

import com.example.StudentCourse.course.repository.CourseRepository;
import com.example.StudentCourse.registration.model.StudentCourse;
import com.example.StudentCourse.registration.service.StudentCourseService;
import com.example.StudentCourse.student.model.Student;
import com.example.StudentCourse.student.repository.StudentRepository;
import com.example.StudentCourse.student.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentCourseController {

    @Autowired
    private StudentCourseService studentCourseService;

    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private CourseRepository courseRepository;

    @RequestMapping("/registration")
    public List<StudentCourse> getAll() {
        return studentCourseService.getAll();
    }

    @RequestMapping("/registration/{id}")
    public StudentCourse getById(@PathVariable long id) {
        return studentCourseService.getById(id);
    }

    @RequestMapping("/student/listCourses/{SId}")
    public List<StudentCourse> getBySId(@PathVariable String SId) {
        return studentCourseService.getBySId(SId);
    }

    @RequestMapping("/enrolledInCourse/{CId}")
    public List<StudentCourse> getByCId(@PathVariable String CId) {
        return studentCourseService.getByCId(CId);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/registration")
    public void add(@RequestBody StudentCourse s) {
        if(studentRepository.existsById(s.getsId())
                && courseRepository.existsById(s.getcId())
                && studentCourseService.getBySId(s.getsId()).size() < 6
                && studentCourseService.check(s.getsId(),s.getcId()))
            studentCourseService.add(s);
        else
            return;
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/registration/{id}")
    public void update(@PathVariable long id,@RequestBody StudentCourse s) {
        studentCourseService.add(s);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/registration/{id}")
    public void delete(@PathVariable long id) {
        studentCourseService.delete(id);
    }

}
