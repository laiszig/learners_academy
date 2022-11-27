package com.laiszig.learners_academy.servlet;

import com.laiszig.learners_academy.entity.CourseClass;
import com.laiszig.learners_academy.entity.Student;
import com.laiszig.learners_academy.service.ClassService;
import com.laiszig.learners_academy.service.StudentService;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(name = "classEnroll", value = "/classenroll")
public class ClassEnrollServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String studentId = request.getParameter("student_id");
        String classId = request.getParameter("classes");

        ClassService classService = new ClassService();
        CourseClass courseClass = classService.findById(Long.parseLong(classId));

        StudentService studentService = new StudentService();
        Student student = studentService.findById(Long.parseLong(studentId));
        student.setCourseClass(courseClass);
        studentService.save(student);
    }
}
