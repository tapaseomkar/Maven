<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
 <style>
        table,th,td
        {
            border: 1px solid black;
            
        }
  </style>
</head>
<body>
<form>
    
    <table>
        <tr>
          <th>ID</th>
          <th>NAME</th>
          <th>SALARY</th>
          <th>EDIT</th>
          <th>DELETE</th>  
        </tr>
       <c:forEach var="list" items="${employee}">
        <tr>
        <td>${list.id}</td>
        <td>${list.name}</td>
        <td>${list.salary}</td>
        <td><a href="deleteemp/${list.id}">DELETE</a></td>
        <td><a href="editemp/${list.id}">UPDATE</a></td>
        </tr>
        </c:forEach>
      </table>
</form>
<a href="empform">ADD EMPLOYEE</a>
 

</body>
</html>