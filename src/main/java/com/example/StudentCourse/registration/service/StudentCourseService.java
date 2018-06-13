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

    public StudentCourse getById(long id) {
        return studentCourseRepository.findById(id).get();
    }

    public List<StudentCourse> getBySId(String SId) {
        return studentCourseRepository.findBySId(SId);
    }

    public List<StudentCourse> getByCId(String CId) {
        return studentCourseRepository.findByCId(CId);
    }

    public void add(StudentCourse s) {
        studentCourseRepository.save(s);
    }

    public void delete(long id) {
        studentCourseRepository.deleteById(id);
    }

    public boolean check(String sid, String cid) {
        return studentCourseRepository
                .findBySId(sid)
                .stream()
                .filter(c -> c.getcId().equals(cid))
                .count() == 0;
    }

}
