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
<a href="http://localhost:8080/learners_academy_war_exploded/classadd.jsp">Add New Class</a>
<a href="http://localhost:8080/learners_academy_war_exploded/">Back</a>
<table style="border: 1px solid black;">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Start Date</th>
        <th>End Date</th>
        <th>Subject</th>
        <th>Students</th>
        <th>Report</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${classes}" var="courseClass" >
        <tr style="border: 1px solid black;">
            <td  width="50" style="border: 1px solid black; text-align: center">${courseClass.id}</td>
            <td  width="200" style="border: 1px solid black; text-align: center">${courseClass.name}</td>
            <td  width="100" style="border: 1px solid black; text-align: center">${courseClass.startDate}</td>
            <td  width="100" style="border: 1px solid black; text-align: center">${courseClass.endDate}</td>
            <td width="50" style="border: 1px solid black; text-align: center"> <a href="http://localhost:8080/learners_academy_war_exploded/courseclass?id=${courseClass.id}&page=assignTeachers">Edit</a>
            <td width="50" style="border: 1px solid black; text-align: center"> <a href="http://localhost:8080/learners_academy_war_exploded/courseclass?id=${courseClass.id}&page=viewStudents">View</a>
            <td width="50" style="border: 1px solid black; text-align: center"> <a href="http://localhost:8080/learners_academy_war_exploded/courseclass?id=${courseClass.id}&page=report">View</a>
        </tr>
    </c:forEach>
    </tbody>
</table>
</body>
</html>