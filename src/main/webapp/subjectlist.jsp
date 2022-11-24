<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Course Class</title>
</head>
<body>
<h1><%= "Subject: list" %>
</h1>
<br/>
<a href="http://localhost:8080/learners_academy_war_exploded/subjectadd.jsp">Add New Subject</a>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Subject</th>
        <th>Subject Description</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${subjects}" var="subject" >

        <tr>
            <td>${subject.id}</td>
            <td>${subject.name}</td>
            <td>${subject.description}</td>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>