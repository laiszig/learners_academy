package com.laiszig.learners_academy.dao;

import com.laiszig.learners_academy.entity.Teacher;

import java.util.List;

public interface TeacherDao {

    void save(Teacher teacher);
    List<Teacher> findAll();
}
