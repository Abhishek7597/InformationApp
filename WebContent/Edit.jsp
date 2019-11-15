<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	
	<%@ page import="java.sql.*"%>
	<%@ page import="javax.sql.*"%>
	<%@ page import="javax.swing.*"%>

<%String num = request.getParameter("num");
System.out.print(num);%>
    <form action = "AddOrEdit" method = "post" >
    
			<table border="0">
				<td>FirstName</td>
				<td><input type="text" name="firstName"
					placeholder="Enter your FirstName"></td>
				</tr>
				<tr>
					<td>LastName</td>
					<td><input type="text" name="lastName"
						placeholder="Enter your LastName"></td>
				</tr>
				<tr>
					<td>Address</td>
					<td><input type="text" name="address"
						placeholder="Enter your Full Address"></td>
				</tr>
				<tr>
					<td>Age</td>
					<td><input type="text" name="age" placeholder="Enter your Age"></td>

				<tr> <td><input type="submit" name = "edityuvak" value="submit"></td></tr>
			</table>
	</form>

</body>
</html>