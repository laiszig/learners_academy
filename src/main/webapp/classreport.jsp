<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student</title>
</head>
<body>
<h1>
    ${courseClass.name} Class Report
</h1>
<br/>
<a href="http://localhost:8080/learners_academy_war_exploded/courseclass">Back</a>
<h2>Subjects</h2>
<table style="border: 1px solid black;">
    <thead>
    <tr>
        <th>Subject</th>
        <th>Teacher</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${links}" var="link" >
        <tr>
            <td  width="200" style="border: 1px solid black; text-align: center">${link.subject.name}</td>
            <td  width="200" style="border: 1px solid black; text-align: center">${link.teacher.name}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<h2>Students</h2>
<table style="border: 1px solid black;">
    <thead>
    <tr>
        <th>ID</th>
        <th>Student</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${students}" var="student" >

        <tr style="border: 1px solid black;">
            <td width="50" style="border: 1px solid black; text-align: center">${student.id}</td>
            <td width="200" style="border: 1px solid black; text-align: center">${student.name}</td>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>