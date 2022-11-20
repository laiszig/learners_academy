package com.laiszig.learners_academy.servlet;

import com.laiszig.learners_academy.dao.impl.SubjectDaoImpl;
import com.laiszig.learners_academy.entity.Subject;
import com.laiszig.learners_academy.service.SubjectService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "subject", value = "/subject")
public class SubjectServlet extends HttpServlet {

//    @Override
//    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

//        String name = request.getParameter("name");
//
//        CourseClass courseClass = new CourseClass();
//        courseClass.setName(name);
//
//        ClassService classService = new ClassService();
//        classService.save(courseClass);
//    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        Subject subject = new Subject();
        subject.setName("oiiiiii");



        SubjectService subjectService = new SubjectService();

        subjectService.save(subject);




//
//
//        Transaction transaction = null;
//        try(Session session = HibernateUtil.getSessionFactory().openSession()){
//            transaction = session.beginTransaction();
//            session.save(subject);
//            transaction.commit();
//
//        } catch(Exception exception) {
//            transaction.rollback();
//            exception.printStackTrace();
//        }



//        ClassService classService = new ClassService();
//        List<CourseClass> classes = classService.findAll();
//        request.setAttribute("classes", classes);
//        RequestDispatcher rdst =  request.getRequestDispatcher("class/list.jsp");
//        rdst.forward(request, response);
//    }
    }
}
