package com.laiszig.learners_academy.service;

import com.laiszig.learners_academy.dao.ClassDao;
import com.laiszig.learners_academy.dao.impl.ClassDaoImpl;
import com.laiszig.learners_academy.entity.CourseClass;

public class ClassService {

    public void save (CourseClass courseClass) {
        ClassDao classDao = new ClassDaoImpl();
        classDao.save(courseClass);
    }
}
