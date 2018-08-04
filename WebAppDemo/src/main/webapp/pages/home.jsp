<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 I'm home.jsp Welcome <% String name=(String)request.getAttribute("aName"); out.println(name); %> 
</body>
</html>