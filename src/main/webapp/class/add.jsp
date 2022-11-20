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
<form method = "post"  action = "class">
    Name: <input type = "text" name = "name"/>
    <br>
    <input type = "submit" value = "Add"/>
</form>
</body>
</html>