<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
  <title>Subject</title>
</head>
<body>
<h1><%= "Subject" %>
</h1>
<br/>
<form method = "post"  action = "subject">
  Name: <input type = "text" name = "name"/>
  <br>
  <input type = "submit" value = "Add"/>
</form>
<br>
<a href="http://localhost:8080/learners_academy_war_exploded/subject">Back</a>
</body>
</html>