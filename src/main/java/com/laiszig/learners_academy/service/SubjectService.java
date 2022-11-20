package com.laiszig.learners_academy.service;

import com.laiszig.learners_academy.dao.ClassDao;
import com.laiszig.learners_academy.dao.SubjectDao;
import com.laiszig.learners_academy.dao.impl.ClassDaoImpl;
import com.laiszig.learners_academy.dao.impl.SubjectDaoImpl;
import com.laiszig.learners_academy.entity.CourseClass;
import com.laiszig.learners_academy.entity.Subject;

import java.util.List;

public class SubjectService {

    public void save (Subject subject) {
        SubjectDao subjectDao = new SubjectDaoImpl();
        subjectDao.save(subject);
    }

    public List<Subject> findAll () {
        return null;
    }
}
