<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>ADD Yuvak</title>
</head>
<body>

<form action= "YuvakData.jsp">
    <input type = "submit" value = "Go Back">
</form>

	<form method = "post" action = "AddOrEdit" >

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

				<tr> <td><input type="submit" name = "addyuvak" value="submit"></td></tr>
			</table>
	</form>
	
	
</body>
</html>