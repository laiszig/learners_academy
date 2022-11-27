package com.laiszig.learners_academy.servlet;

import java.io.*;
import java.util.List;

import com.laiszig.learners_academy.entity.CourseClass;
import com.laiszig.learners_academy.entity.Subject;
import com.laiszig.learners_academy.entity.Teacher;
import com.laiszig.learners_academy.service.ClassService;
import com.laiszig.learners_academy.service.SubjectService;
import com.laiszig.learners_academy.service.TeacherService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "class", value = "/courseclass")
public class CourseClassServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");

        CourseClass courseClass = new CourseClass();
        courseClass.setName(name);

        ClassService classService = new ClassService();
        classService.save(courseClass);

        response.sendRedirect(request.getHeader("referer"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String id = request.getParameter("id");

        if (id == null) {
            ClassService classService = new ClassService();
            List<CourseClass> classes = classService.findAll();
            request.setAttribute("classes", classes);
            RequestDispatcher rdst = request.getRequestDispatcher("classlist.jsp");
            rdst.forward(request, response);
        }
        else {
            SubjectService subjectService = new SubjectService();
            List<Subject> subjects = subjectService.findAll();
            request.setAttribute("subjects", subjects);

            TeacherService teacherService = new TeacherService();
            List<Teacher> teachers = teacherService.findAll();
            request.setAttribute("teachers", teachers);

            ClassService classService = new ClassService();
            CourseClass courseClass = classService.findById(Long.parseLong(id));
            request.setAttribute("courseClass", courseClass);

            RequestDispatcher rdst = request.getRequestDispatcher("classedit.jsp");
            rdst.forward(request, response);
        }
    }

    public void destroy() {
    }
}