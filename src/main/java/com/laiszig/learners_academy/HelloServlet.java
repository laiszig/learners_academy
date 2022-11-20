package com.laiszig.learners_academy;

import java.io.*;

import com.laiszig.learners_academy.entity.CourseClass;
import com.laiszig.learners_academy.service.ClassService;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "class", value = "/class")
public class HelloServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {

        String name = request.getParameter("name");

        CourseClass courseClass = new CourseClass();
        courseClass.setName(name);

        ClassService classService = new ClassService();
        classService.save(courseClass);

    }

    public void destroy() {
    }
}