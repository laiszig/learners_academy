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
<ul>
<c:forEach items="${subjects}" var="subject" >
    <li>${subject.name}</li>
</c:forEach>
</ul>
<%--<label for="classes">Choose a class:</label>--%>

<%--<form method = "post"  action = "classenroll">--%>
<%--    <select name="classes" id="classes">--%>
<%--        <c:forEach items="${classes}" var="courseClass" >--%>
<%--            <option value="${courseClass.id}">${courseClass.name}</option>--%>
<%--        </c:forEach>--%>
<%--    </select>--%>
<%--    <input type="hidden" id="student_id"  name="student_id" value="${student.id}"/>--%>
<%--    <input type = "submit" value = "Enroll"/>--%>
<%--</form>--%>
</body>
</html>