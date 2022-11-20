package com.laiszig.learners_academy.dao.impl;

import com.laiszig.learners_academy.config.HibernateUtil;
import com.laiszig.learners_academy.dao.ClassDao;
import com.laiszig.learners_academy.dao.SubjectDao;
import com.laiszig.learners_academy.entity.CourseClass;
import com.laiszig.learners_academy.entity.Subject;
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

}
