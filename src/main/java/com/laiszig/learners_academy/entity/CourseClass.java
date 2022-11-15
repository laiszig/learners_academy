package com.laiszig.learners_academy.entity;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "class")
public class CourseClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "class_id")
    private long id;

    @Column(name= "name")
    private String name;

    @Column(name= "start_date")
    private Date startDate;

    @Column(name= "end_date")
    private Date endDate;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
