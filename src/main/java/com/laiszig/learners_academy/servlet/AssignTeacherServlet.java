package com.laiszig.learners_academy.servlet;

import com.laiszig.learners_academy.entity.ClassSubjectTeacherLink;
import com.laiszig.learners_academy.entity.CourseClass;
import com.laiszig.learners_academy.entity.Subject;
import com.laiszig.learners_academy.entity.Teacher;
import com.laiszig.learners_academy.service.AssignTeacherService;
import com.laiszig.learners_academy.service.ClassService;
import com.laiszig.learners_academy.service.SubjectService;
import com.laiszig.learners_academy.service.TeacherService;

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

        TeacherService teacherService = new TeacherService();
        Teacher teacher = teacherService.findById(Long.valueOf(teacherId));

        ClassService classService = new ClassService();
        CourseClass courseClass = classService.findById(Long.parseLong(classId));

        SubjectService subjectService = new SubjectService();
        Subject subject = subjectService.findById(Long.valueOf(subjectId));

        ClassSubjectTeacherLink link = new ClassSubjectTeacherLink();
        link.setTeacher(teacher);
        link.setCourseClass(courseClass);
        link.setSubject(subject);
        AssignTeacherService assignTeacherService = new AssignTeacherService();
        assignTeacherService.save(link);

        response.sendRedirect(request.getHeader("referer"));
    }
}
