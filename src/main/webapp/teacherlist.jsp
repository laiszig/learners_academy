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
<a href="http://localhost:8080/learners_academy_war_exploded/">Back</a>
<table style="border: 1px solid black;">
    <thead>
    <tr>
        <th>ID</th>
        <th>Teacher</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${teachers}" var="teacher" >

        <tr style="border: 1px solid black;">
            <td width="50" style="border: 1px solid black; text-align: center">${teacher.id}</td>
            <td width="200" style="border: 1px solid black; text-align: center">${teacher.name}</td>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>