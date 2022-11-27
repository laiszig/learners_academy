package com.laiszig.learners_academy.service;

import com.laiszig.learners_academy.dao.StudentDao;
import com.laiszig.learners_academy.dao.TeacherDao;
import com.laiszig.learners_academy.dao.impl.StudentDaoImpl;
import com.laiszig.learners_academy.dao.impl.TeacherDaoImpl;
import com.laiszig.learners_academy.entity.Student;
import com.laiszig.learners_academy.entity.Teacher;

import java.util.List;

public class TeacherService {

    public void save (Teacher teacher) {
        TeacherDao teacherDao = new TeacherDaoImpl();
        teacherDao.save(teacher);
    }

    public List<Teacher> findAll () {
        TeacherDao teacherDao = new TeacherDaoImpl();
        return teacherDao.findAll();
    }

    public Teacher findById (Long id) {
        TeacherDao teacherDao = new TeacherDaoImpl();
        return teacherDao.findById(id);
    }
}
