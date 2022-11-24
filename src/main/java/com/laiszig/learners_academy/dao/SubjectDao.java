package com.laiszig.learners_academy.dao;

import com.laiszig.learners_academy.entity.CourseClass;
import com.laiszig.learners_academy.entity.Subject;

import java.util.List;

public interface SubjectDao {

    void save(Subject subject);

    List<Subject> findAll();

}
