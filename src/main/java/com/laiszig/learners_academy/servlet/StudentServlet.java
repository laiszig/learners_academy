package com.laiszig.learners_academy.servlet;

import com.laiszig.learners_academy.entity.Student;
import com.laiszig.learners_academy.service.StudentService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "student", value = "/student")
public class StudentServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");

        Student student = new Student();
        student.setName(name);

        StudentService studentService = new StudentService();
        studentService.save(student);

        response.sendRedirect(request.getHeader("referer"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        StudentService studentService = new StudentService();
        List<Student> students = studentService.findAll();
        request.setAttribute("students", students);
        RequestDispatcher rdst =  request.getRequestDispatcher("studentlist.jsp");
        rdst.forward(request, response);
    }
}
