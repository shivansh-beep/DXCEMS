<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div align="right"><a href="index.jsp">HOME</a></div>
<hr>
<div>${msg }</div>

	<div class="div1">Pet Peers</div>
	<div class="div2">Sign In</div>
	<form action="signIn"  method="post">
	
		
		
				<label>Username:</label>
			<input type="text" name="userName" required="required">
		
		
			
				<label>Password:</label>
			<input type="password" name="password" required="required">		
	
			
				
			<input type="submit" value="login">
			<input type="reset" value="Reset">
		
	</form>
</body>
</html>