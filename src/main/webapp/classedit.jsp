<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Class</title>
</head>
<body>
<h1> Editing Class: ${courseClass.name}</h1>
<br/>
<a href="http://localhost:8080/learners_academy_war_exploded/courseclass">Back to Class List</a>
<br>
<br>
<%--<ul>--%>
<%--<c:forEach items="${subjects}" var="subject" >--%>
<%--    <li>${subject.name}</li>--%>
<%--</c:forEach>--%>
<%--</ul>--%>

<form method = "post"  action = "assignteacher">
    <label for="subject_id">Subject</label>
    <select name="subject_id" id="subject_id">
        <c:forEach items="${subjects}" var="subject" >
            <option value="${subject.id}">${subject.name}</option>
        </c:forEach>
    </select>
    <label for="teacher_id">Teacher</label>
    <select name="teacher_id" id="teacher_id">
        <c:forEach items="${teachers}" var="teacher" >
            <option value="${teacher.id}">${teacher.name}</option>
        </c:forEach>
    </select>
    <input type="hidden" id="class_id"  name="class_id" value="${courseClass.id}"/>
    <input type = "submit" value = "Assign"/>
</form>
<table>
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
</body>
</html>