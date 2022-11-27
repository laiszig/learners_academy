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
        String url = request.getRequestURL().toString();
        System.out.println(url);
        String id = request.getParameter("id");
        System.out.println(id);

        if (id == null) {
            StudentService studentService = new StudentService();
            List<Student> students = studentService.findAll();
            request.setAttribute("students", students);

            RequestDispatcher rdst = request.getRequestDispatcher("studentlist.jsp");
            rdst.forward(request, response);
        } else {
            StudentService studentService = new StudentService();
            Student student = studentService.findById(Long.parseLong(id));
            request.setAttribute("student", student);
            RequestDispatcher rdst = request.getRequestDispatcher("studentedit.jsp");
            rdst.forward(request, response);
        }
    }
}

