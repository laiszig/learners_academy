package com.laiszig.learners_academy.service;

import com.laiszig.learners_academy.dao.ClassDao;
import com.laiszig.learners_academy.dao.StudentDao;
import com.laiszig.learners_academy.dao.impl.ClassDaoImpl;
import com.laiszig.learners_academy.dao.impl.StudentDaoImpl;
import com.laiszig.learners_academy.entity.CourseClass;
import com.laiszig.learners_academy.entity.Student;

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

    public CourseClass findById (long id) {
        ClassDao classDao = new ClassDaoImpl();
        return classDao.findById(id);
    }
}
