<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<html>
<head>
<title>Hello</title>
</head>
<body>
  <h1>Welcome to Jai Shree ram</h1>
  <%
  Integer id = (Integer)request.getAttribute("id");
  String name = (String)request.getAttribute("name");
  Integer salary = (Integer)request.getAttribute("salary");
  out.println(id);
  out.println(name);
  out.println(salary);
  
  %>
  <br>
  ID1:
  <b>${id}</b>
   <br>
  Name1:
  <b>${name}</b>
   <br>
  Salary1:
  <b>${salary}</b>
</body>
</html>