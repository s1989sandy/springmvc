<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>


<html>
<head>

<title>Spring MVC</title>
</head>
<body>
<h1>Student Registration</h1>
<form:form action="addStudent.htm" method="POST" modelAttribute="stud">
Name:<form:input path="name"/><br>
Phone:<form:input path="phone"/><br>
Age:<form:input path="age"/><br>
<input type="submit" value="Register Student">
</form:form>
</body>
</html>