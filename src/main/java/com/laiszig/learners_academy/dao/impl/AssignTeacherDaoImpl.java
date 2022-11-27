package com.laiszig.learners_academy.dao.impl;

import com.laiszig.learners_academy.config.HibernateUtil;
import com.laiszig.learners_academy.dao.AssignTeacherDao;
import com.laiszig.learners_academy.entity.ClassSubjectTeacherLink;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.ArrayList;
import java.util.List;

public class AssignTeacherDaoImpl implements AssignTeacherDao {

    @Override
    public void save(ClassSubjectTeacherLink link) {
        Transaction transaction = null;
        try(Session session = HibernateUtil.getSessionFactory().openSession()){
            transaction = session.beginTransaction();
            session.saveOrUpdate(link);
            transaction.commit();

        } catch(Exception exception) {
            transaction.rollback();
        }
    }

    @Override
    public List<ClassSubjectTeacherLink> findAllByClass(Long classId) {
        List<ClassSubjectTeacherLink> links = new ArrayList<>();
        Session session = HibernateUtil.getSessionFactory().openSession();

        try {
            session.beginTransaction();

            links = session.createQuery("from ClassSubjectTeacherLink where courseClass.id", ClassSubjectTeacherLink.class).list();
            session.getTransaction().commit();

        } catch (Exception e) {
            e.printStackTrace();
        }
        return links;
    }
}
