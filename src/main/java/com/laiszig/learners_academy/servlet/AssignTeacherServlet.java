package com.laiszig.learners_academy.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "AssignTeacherServlet", value = "/assignteacher")
public class AssignTeacherServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String teacherId = request.getParameter("teacher_id");
        String classId = request.getParameter("class_id");
        String subjectId = request.getParameter("subject_id");





    }
}
