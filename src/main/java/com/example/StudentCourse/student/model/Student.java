package com.example.StudentCourse.student.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Student {

    @Id
    private String rollNo;
    private String name;
    private int sem;

    public Student() {
        this.rollNo = "0";
        this.name = "";
        this.sem = 0;
    }

    public Student(String rollNo, String name, int sem) {
        this.rollNo = rollNo;
        this.name = name;
        this.sem = sem;
    }

    public String getRollNo() {
        return rollNo;
    }

    public void setRollNo(String rollNo) {
        this.rollNo = rollNo;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSem() {
        return sem;
    }

    public void setSem(int sem) {
        this.sem = sem;
    }
}
