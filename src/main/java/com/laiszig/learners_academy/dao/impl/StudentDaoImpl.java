package com.laiszig.learners_academy.dao.impl;

import com.laiszig.learners_academy.config.HibernateUtil;
import com.laiszig.learners_academy.dao.StudentDao;
import com.laiszig.learners_academy.entity.Student;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class StudentDaoImpl implements StudentDao {

    @Override
    public void save(Student student) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.save(student);
            transaction.commit();

        } catch(Exception exception) {
            exception.printStackTrace();
            transaction.rollback();
        }
    }

    @Override
    public List<Student> findAll() {
        List<Student> students = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();

            students = session.createQuery("from Student", Student.class).list();
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return students;
    }
}
