package com.laiszig.learners_academy.dao;

import com.laiszig.learners_academy.entity.CourseClass;

import java.util.List;

public interface ClassDao {

    void save(CourseClass courseClass);
    List<CourseClass> findAll();
    CourseClass find(Long id);
    void update(CourseClass courseClass);
    void delete(Long id);
    CourseClass findById(long id);
}
