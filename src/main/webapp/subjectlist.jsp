<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Subject</title>
</head>
<body>
<h1><%= "Subject: list" %>
</h1>
<br/>
<a href="http://localhost:8080/learners_academy_war_exploded/subjectadd.jsp">Add New Subject</a>
<a href="http://localhost:8080/learners_academy_war_exploded/">Back</a>
<table style="border: 1px solid black;">
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

        <tr style="border: 1px solid black;">
            <td width="50" style="border: 1px solid black; text-align: center">${subject.id}</td>
            <td width="200" style="border: 1px solid black; text-align: center">${subject.name}</td>
            <td width="200" style="border: 1px solid black; text-align: center">${subject.description}</td>
            </td>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>