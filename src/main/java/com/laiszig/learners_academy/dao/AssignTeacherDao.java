package com.laiszig.learners_academy.dao;

import com.laiszig.learners_academy.entity.ClassSubjectTeacherLink;

import java.util.List;

public interface AssignTeacherDao {

    void save(ClassSubjectTeacherLink link);

    List<ClassSubjectTeacherLink> findAllByClass(Long classId);
}
