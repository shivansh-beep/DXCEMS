<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>

<html>
<head>

<script>
	// Function to check Whether both passwords 
	// is same or not. 
	function checkPassword(form) {
		var password1 = form.password1.value;
		var password2 = form.password2.value;

		// If  same return true.     
		if(password1==password2) {
			alert("Password Match")
		}

		// If not same return false. 
		else {
			alert("Password did not match")
			return false;
		}
	}
	
</script>

</head>
<body>
<div align="right"><a href="index.jsp">HOME</a>  <a href="Login.jsp">Login</a> <a href="">User Registraion</a></div>
<hr>
<div>${msg }</div>

	<div class="div1">Pet Peers</div>
	<div class="div2">Sign Un</div>
	<div id='container'>
	 <div class='signup'>
	<form action="registered" onSubmit="return checkPassword(this)" method="post">
	
		
			
			<input type="text" name="userName" placeholder='username' required="required">
		
		
			<input type="password" name="password1" placeholder='password' required="required">		
	
			
				<input type="password" name="password2" placeholder='confirm password' required="required">
				
			<input type="submit" value="Submit">
			<input type="reset" value="Reset">
		
	</form>
	</div>
	</div>
</body>
</html>
