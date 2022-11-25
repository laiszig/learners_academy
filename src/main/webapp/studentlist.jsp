<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Student</title>
</head>
<body>
<h1><%= "Student: list" %>
</h1>
<br/>
<a href="http://localhost:8080/learners_academy_war_exploded/studentadd.jsp">Add New Student</a>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Student</th>
        <th>Class ID</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${students}" var="student" >

        <tr>
            <td>${student.id}</td>
            <td>${student.name}</td>
            <td>${student.classId}</td>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>