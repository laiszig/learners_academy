package com.laiszig.learners_academy.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "teacher")
public class Teacher {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "teacher_id")
    private long id;

    @Column(name = "teacher_name")
    private String name;

    @OneToMany(mappedBy = "teacher", cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    private List<ClassSubjectTeacherLink> classSubjectTeacherLinks;

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

    public List<ClassSubjectTeacherLink> getClassSubjectTeacherLinks() {
        return classSubjectTeacherLinks;
    }

    public void setClassSubjectTeacherLinks(List<ClassSubjectTeacherLink> classSubjectTeacherLinks) {
        this.classSubjectTeacherLinks = classSubjectTeacherLinks;
    }
}
