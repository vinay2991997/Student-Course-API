package com.example.StudentCourse.course.controller;

import com.example.StudentCourse.course.model.Course;
import com.example.StudentCourse.course.service.CourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CourseController {

    @Autowired
    private CourseService courseService;

    @RequestMapping("courses")
    public List<Course> getAll() {
        return courseService.getAll();
    }

    @RequestMapping("courses/{id}")
    public Course getById(@PathVariable String id) {
        return courseService.getById(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/courses")
    public void add(@RequestBody Course s){
        courseService.add(s);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/courses/{id}")
    public void update(@PathVariable String id,@RequestBody Course s){
        courseService.add(s);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/courses/{id}")
    public void delete(@PathVariable String id){
        courseService.delete(id);
    }
}
