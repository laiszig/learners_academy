package com.laiszig.learners_academy.dao;

import com.laiszig.learners_academy.entity.Student;

import java.util.List;

public interface StudentDao {

    void save(Student student);
    List<Student> findAll();

    Student findById(long id);
}
