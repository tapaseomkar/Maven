<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Add New Employee</h1>
	<form method="post" action="save">    
    <table > 
    <tr>    
      <td>ID : </td>   
      <td><input name="id" type="text" /></td>  
     </tr>    
     <tr>    
     <tr>    
      <td>Name : </td>   
      <td><input name="name" type="text" /></td>  
     </tr>    
     <tr>    
      <td>Salary :</td>    
      <td><input name="salary" type="text"/></td>  
     </tr>   
      
      <td> </td>    
      <td><input type="submit" value="Save"  /></td>    
     </tr>    
    </table>    
   </form> 
	
</body>
</html>