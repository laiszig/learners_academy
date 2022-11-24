<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Course Class</title>
</head>
<body>
<h1><%= "Course Class" %>
</h1>
<br/>
<form method = "post"  action = "courseclass">
    Name: <input type = "text" name = "name"/>
    <br>
    <input type = "submit" value = "Add"/>
</form>
<br>
<a href="http://localhost:8080/learners_academy_war_exploded/courseclass">Classes</a>
</body>
</html>