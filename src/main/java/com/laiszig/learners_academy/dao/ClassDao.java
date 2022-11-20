package com.laiszig.learners_academy.dao;

import com.laiszig.learners_academy.entity.CourseClass;

public interface ClassDao {

    void save(CourseClass courseClass);
    CourseClass find(Long id);
    void update(CourseClass courseClass);
    void delete(Long id);
}
