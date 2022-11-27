package com.laiszig.learners_academy.entity;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table (name = "subject")
public class Subject {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "subject_id")
    private long id;

    @Column(name = "subject_name")
    private String name;

    @Column(name = "subject_description")
    private String description;

    @ManyToMany(mappedBy = "subjects")
    private List<CourseClass> classes;

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public List<CourseClass> getClasses() {
        return classes;
    }

    public void setClasses(List<CourseClass> classes) {
        this.classes = classes;
    }

    @Override
    public String toString() {
        return "Subject{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
