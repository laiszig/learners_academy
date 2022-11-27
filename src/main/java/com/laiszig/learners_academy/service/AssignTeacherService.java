package com.laiszig.learners_academy.service;

import com.laiszig.learners_academy.dao.AssignTeacherDao;
import com.laiszig.learners_academy.dao.ClassDao;
import com.laiszig.learners_academy.dao.impl.AssignTeacherDaoImpl;
import com.laiszig.learners_academy.dao.impl.ClassDaoImpl;
import com.laiszig.learners_academy.entity.ClassSubjectTeacherLink;
import com.laiszig.learners_academy.entity.CourseClass;

import java.util.List;

public class AssignTeacherService {

    public void save (ClassSubjectTeacherLink link) {
        AssignTeacherDao assignTeacherDao = new AssignTeacherDaoImpl();
        assignTeacherDao.save(link);
    }

    public List<ClassSubjectTeacherLink> findAllByClass (Long classId) {
        AssignTeacherDao assignTeacherDao = new AssignTeacherDaoImpl();
        return assignTeacherDao.findAllByClass(classId);
    }
}
