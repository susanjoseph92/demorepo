<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
	<h3>Sign Up</h3>
	<form action="LoginController" method="get">
		<table>
			<tr>
				<td>User Name:</td>
				<td><input type="text" name="uname" required /></td>
			</tr>
			<tr>
				<td>Password:</td>
				<td><input type="password" name="pwd" required /></td>
			</tr>
			<!-- tr>
				<td>Contact:</td>
				<td><input type="text" name="contact" /></td>
			</tr>
			<tr>
				<td>Address:</td>
				<td><textarea cols="25" rows="5" name="address"> </textarea></td>
			</tr-->
			<tr>
				<td><input type="submit" value="SUBMIT" ></td>
				<td><input type="reset" value="RESET" ></td>
			</tr>
		</table>
	</form>

</body>
</html>