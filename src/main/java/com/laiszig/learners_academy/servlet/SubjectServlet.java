package com.laiszig.learners_academy.servlet;

import com.laiszig.learners_academy.dao.impl.SubjectDaoImpl;
import com.laiszig.learners_academy.entity.CourseClass;
import com.laiszig.learners_academy.entity.Subject;
import com.laiszig.learners_academy.service.ClassService;
import com.laiszig.learners_academy.service.SubjectService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "subject", value = "/subject")
public class SubjectServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");

        Subject subject = new Subject();
        subject.setName(name);

        SubjectService subjectService = new SubjectService();
        subjectService.save(subject);

        response.sendRedirect(request.getHeader("referer"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        SubjectService subjectService = new SubjectService();
        List<Subject> subjects = subjectService.findAll();
        request.setAttribute("subjects", subjects);
        RequestDispatcher rdst =  request.getRequestDispatcher("subjectlist.jsp");
        rdst.forward(request, response);
    }
}

