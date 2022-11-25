package com.laiszig.learners_academy.dao.impl;

import com.laiszig.learners_academy.config.HibernateUtil;
import com.laiszig.learners_academy.dao.SubjectDao;
import com.laiszig.learners_academy.dao.TeacherDao;
import com.laiszig.learners_academy.entity.Subject;
import com.laiszig.learners_academy.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class TeacherDaoImpl implements TeacherDao {

    @Override
    public void save(Teacher teacher) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(teacher);
            transaction.commit();

        } catch(Exception exception) {
            exception.printStackTrace();
            transaction.rollback();
        }
    }

    @Override
    public List<Teacher> findAll() {
        List<Teacher> teachers = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();

            teachers = session.createQuery("from Teacher", Teacher.class).list();
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return teachers;
    }

}
