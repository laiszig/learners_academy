package com.laiszig.learners_academy.dao.impl;

import com.laiszig.learners_academy.config.HibernateUtil;
import com.laiszig.learners_academy.dao.SubjectDao;
import com.laiszig.learners_academy.entity.Subject;
import com.laiszig.learners_academy.entity.Teacher;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class SubjectDaoImpl implements SubjectDao {

    @Override
    public void save(Subject subject) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(subject);
            transaction.commit();

        } catch(Exception exception) {
            exception.printStackTrace();
            transaction.rollback();
        }
    }

    @Override
    public List<Subject> findAll() {
        List<Subject> subjects = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();

            subjects = session.createQuery("from Subject", Subject.class).list();
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return subjects;
    }

    @Override
    public Subject findById(Long id) {
        Subject subject = null;
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();

            subject = session.createQuery("from Subject where id = " + id, Subject.class).getSingleResult();
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return subject;
    }

}
