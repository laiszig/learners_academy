package com.laiszig.learners_academy.service;

import com.laiszig.learners_academy.dao.ClassDao;
import com.laiszig.learners_academy.dao.impl.ClassDaoImpl;
import com.laiszig.learners_academy.entity.CourseClass;

import java.util.List;

public class ClassService {

    public void save (CourseClass courseClass) {
        ClassDao classDao = new ClassDaoImpl();
        classDao.save(courseClass);
    }

    public List<CourseClass> findAll () {
        ClassDao classDao = new ClassDaoImpl();
        return classDao.findAll();
    }
}
