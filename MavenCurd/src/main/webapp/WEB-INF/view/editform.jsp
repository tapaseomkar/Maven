<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
   <%@ taglib uri="http://www.springframework.org/tags" prefix="s"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<%@include file="./sample.jsp"%>
</head>
<body>
<h1>Edit Employee</h1> 

<!--  <form method="post" action="save123" >    
    <table > 
    <tr>    
      <td>ID : </td>   
      <td><input name="id" type="text" value="${command.id }" /></td>  
     </tr>    
     <tr>    
     <tr>    
      <td>Name : </td>   
      <td><input name="name" type="text" value="${command.name }" /></td>  
     </tr>    
     <tr>    
      <td>Salary :</td>    
      <td><input name="salary" type="text" value="${command.salary }" /></td>  
     </tr>   
      
      <td> </td>    
      <td><input type="submit" value="Save"  /></td>    
     </tr>    
    </table>    
   </form> 
   -->
   
   
   <div class="container mt-3">

		<h1>Edit Employee Form</h1>
		<form action="${pageContext.request.contextPath}/updateEmployee" method="post">

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="id">Id: </label> <input type="text"
							value="${command.id}" class="form-control" id="id" name="id"
							readonly="readonly">
					</div>
				</div>
			</div>

			<div class="row">
				<div class="col">
					<div class="form-group">
						<label for="name">Name: </label> <input type="text"
							value="${command.name }" class="form-control" id="name"
							name="name" placeholder="Enter Name">
					</div>
				</div>
				<div class="col">
					<div class="form-group">
						<label for="salary">Salary: </label> <input type="text"
							value="${command.salary }" class="form-control"
							id="salary" name="salary"
							placeholder="Enter Designation">
					</div>
				</div>
			</div>

			
			
			<button type="submit" class="btn btn-primary">Submit</button>
		</form>

	</div>
</body>
</html>