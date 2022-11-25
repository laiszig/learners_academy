<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Teacher</title>
</head>
<body>
<h1><%= "Teacher: list" %>
</h1>
<br/>
<a href="http://localhost:8080/learners_academy_war_exploded/teacheradd.jsp">Add New Teacher</a>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Teacher</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${teachers}" var="teacher" >

        <tr>
            <td>${teacher.id}</td>
            <td>${teacher.name}</td>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>