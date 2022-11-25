package com.laiszig.learners_academy.servlet;

import com.laiszig.learners_academy.entity.Subject;
import com.laiszig.learners_academy.entity.Teacher;
import com.laiszig.learners_academy.service.SubjectService;
import com.laiszig.learners_academy.service.TeacherService;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "teacher", value = "/teacher")
public class TeacherServlet extends HttpServlet {

    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String name = request.getParameter("name");

        Teacher teacher = new Teacher();
        teacher.setName(name);

        TeacherService teacherService = new TeacherService();
        teacherService.save(teacher);

        response.sendRedirect(request.getHeader("referer"));
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {

        TeacherService teacherService = new TeacherService();
        List<Teacher> teachers = teacherService.findAll();
        request.setAttribute("teachers", teachers);
        RequestDispatcher rdst =  request.getRequestDispatcher("teacherlist.jsp");
        rdst.forward(request, response);
    }
}

