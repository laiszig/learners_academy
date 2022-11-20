package com.laiszig.learners_academy;

import java.io.*;

import com.laiszig.learners_academy.config.HibernateUtil;
import com.laiszig.learners_academy.entity.CourseClass;
import com.laiszig.learners_academy.service.ClassService;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "helloServlet", value = "/hello-servlet")
public class HelloServlet extends HttpServlet {
    private String message;

    public void init() {
        message = "Hello World!";
    }


    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.setContentType("text/html");

        CourseClass courseClass = new CourseClass();
        courseClass.setName("Math");

        ClassService classService = new ClassService();
        classService.save(courseClass);

        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h1>" + message + "</h1>");
        out.println("</body></html>");
    }

    public void destroy() {
    }
}