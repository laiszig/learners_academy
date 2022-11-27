package com.laiszig.learners_academy.entity;

import jakarta.persistence.*;

import java.util.Date;
import java.util.List;

@Entity
@Table(name = "class")
public class CourseClass {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "class_id")
    private Long id;

    @Column(name= "name")
    private String name;

    @Column(name= "start_date")
    private Date startDate;

    @Column(name= "end_date")
    private Date endDate;

    @OneToMany(mappedBy = "courseClass")
    private List<Student> students;

    @ManyToMany
    @JoinTable(
            name = "class_subject_teacher",
            joinColumns = { @JoinColumn(name = "class_id") },
            inverseJoinColumns = { @JoinColumn(name = "subject_id") }
    )
    private List<Subject> subjects;

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

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

    public List<Subject> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<Subject> subjects) {
        this.subjects = subjects;
    }

    @Override
    public String toString() {
        return "CourseClass{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }

//    public void addStudent(Student student) {
//        students.add(student);
//        student.setCourseClass(this);
//    }
//
//    public void removeStudent(Student student){
//        students.remove(student);
//        student.setCourseClass(null);
//    }
}
