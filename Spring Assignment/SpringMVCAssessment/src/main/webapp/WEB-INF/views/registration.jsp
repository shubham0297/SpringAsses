<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<p> Test Hi </p>
<form:form action="registerUser" method="post">
<label>Username</label>
<form:input path="username"/>
<span><form:errors path="username"></form:errors></span>

<label>Password</label>
<form:input path="pass"/>
<span><form:errors path="pass"></form:errors></span>

<label>Email</label>
<form:input path="email"/>
<span><form:errors path="email"></form:errors></span>

<input type="submit" value="Add">
</form:form>

</body>
</html>