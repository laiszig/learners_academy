package com.laiszig.learners_academy.dao.impl;

import com.laiszig.learners_academy.config.HibernateUtil;
import com.laiszig.learners_academy.dao.ClassDao;
import com.laiszig.learners_academy.entity.CourseClass;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class ClassDaoImpl implements ClassDao {

    @Override
    public void save(CourseClass courseClass) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(courseClass);
            transaction.commit();

        } catch(Exception exception) {
            transaction.rollback();
        }
    }

    @Override
    public List<CourseClass> findAll() {
        List<CourseClass> classes = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();

            classes = session.createQuery("from CourseClass", CourseClass.class).list();
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return classes;
    }

    @Override
    public CourseClass find(Long id) {
        return null;
    }

    @Override
    public void update(CourseClass courseClass) {
    }

    @Override
    public void delete(Long id) {
    }
}
