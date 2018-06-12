package com.example.StudentCourse.registration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudentCourse {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String sId;
    private String cId;
    private String month;

    public StudentCourse() {
        this.sId = "";
        this.cId = "";
        this.id = 0;
        this.month = "";
    }

    public StudentCourse(String sId, String cId, String month) {
        this.id = 0;
        this.sId = sId;
        this.cId = cId;
        this.month = month;
    }

    public long getId() {
        return id;
    }

    public String getsId() {
        return sId;
    }

    public void setsId(String sId) {
        this.sId = sId;
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }
}
