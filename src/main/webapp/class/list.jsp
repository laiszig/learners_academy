<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Course Class</title>
</head>
<body>
<h1><%= "Course Class: list" %>
</h1>
<br/>
<a href="http://localhost:8080/learners_academy_war_exploded/class/add.jsp">Add New Class</a>
<table>
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th></th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${classes}" var="courseClass" >

        <tr>
            <td>${courseClass.id}</td>
            <td>${courseClass.name}</td>
            <td>${courseClass.startDate}</td>
            <td>${courseClass.endDate}</td>
            <td>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>