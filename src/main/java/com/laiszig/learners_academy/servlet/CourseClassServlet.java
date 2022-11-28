package com.laiszig.learners_academy.servlet;

import java.io.*;
import java.util.List;

import com.laiszig.learners_academy.dao.StudentDao;
import com.laiszig.learners_academy.entity.*;
import com.laiszig.learners_academy.service.*;

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
            return;
        }
        String page = request.getParameter("page");
        if (page.equals("assignTeachers")){
            SubjectService subjectService = new SubjectService();
            List<Subject> subjects = subjectService.findAll();
            request.setAttribute("subjects", subjects);

            TeacherService teacherService = new TeacherService();
            List<Teacher> teachers = teacherService.findAll();
            request.setAttribute("teachers", teachers);

            ClassService classService = new ClassService();
            CourseClass courseClass = classService.findById(Long.parseLong(id));
            request.setAttribute("courseClass", courseClass);

            AssignTeacherService assignTeacherService = new AssignTeacherService();
            List<ClassSubjectTeacherLink> links = assignTeacherService.findAllByClass(Long.valueOf(id));
            request.setAttribute("links", links);

            RequestDispatcher rdst = request.getRequestDispatcher("classedit.jsp");
            rdst.forward(request, response);
        }
        else if (page.equals("viewStudents")){
            StudentService studentService = new StudentService();
            List<Student> students = studentService.findAllByClassId(Long.valueOf(id));
            request.setAttribute("students", students);

            ClassService classService = new ClassService();
            CourseClass courseClass = classService.findById(Long.parseLong(id));
            request.setAttribute("courseClass", courseClass);

            RequestDispatcher rdst = request.getRequestDispatcher("classstudentsview.jsp");
            rdst.forward(request, response);
        }
        else if (page.equals("report")){
            StudentService studentService = new StudentService();
            List<Student> students = studentService.findAllByClassId(Long.valueOf(id));
            request.setAttribute("students", students);

            ClassService classService = new ClassService();
            CourseClass courseClass = classService.findById(Long.parseLong(id));
            request.setAttribute("courseClass", courseClass);

            AssignTeacherService assignTeacherService = new AssignTeacherService();
            List<ClassSubjectTeacherLink> links = assignTeacherService.findAllByClass(Long.valueOf(id));
            request.setAttribute("links", links);

            RequestDispatcher rdst = request.getRequestDispatcher("classreport.jsp");
            rdst.forward(request, response);
        }
    }

    public void destroy() {
    }
}