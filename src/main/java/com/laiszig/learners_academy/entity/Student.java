package com.laiszig.learners_academy.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "student")
public class Student {

    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    @Column(name = "student_name")
    private String name;

    @Column(name = "class_id")
    private long classId;
}
