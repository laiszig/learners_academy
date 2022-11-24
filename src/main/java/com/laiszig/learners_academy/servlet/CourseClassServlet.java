package com.laiszig.learners_academy.servlet;

import java.io.*;
import java.util.List;

import com.laiszig.learners_academy.entity.CourseClass;
import com.laiszig.learners_academy.service.ClassService;

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
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        ClassService classService = new ClassService();
        List<CourseClass> classes = classService.findAll();
        request.setAttribute("classes", classes);
        RequestDispatcher rdst =  request.getRequestDispatcher("classlist.jsp");
        rdst.forward(request, response);
    }

    public void destroy() {
    }
}