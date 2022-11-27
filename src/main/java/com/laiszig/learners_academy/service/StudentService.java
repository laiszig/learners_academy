package com.laiszig.learners_academy.service;

import com.laiszig.learners_academy.dao.StudentDao;
import com.laiszig.learners_academy.dao.impl.StudentDaoImpl;
import com.laiszig.learners_academy.entity.Student;

import java.util.List;

public class StudentService {

    public void save (Student student) {
        StudentDao studentDao = new StudentDaoImpl();
        studentDao.save(student);
    }

    public List<Student> findAll () {
        StudentDao studentDao = new StudentDaoImpl();
        return studentDao.findAll();
    }

    public Student findById (Long id) {
        StudentDao studentDao = new StudentDaoImpl();
        return studentDao.findById(id);
    }
}
