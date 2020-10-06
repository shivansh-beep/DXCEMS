<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>

<body>
	<div align="right">
		<a href="pet_home">home</a>   <a href="Logout">Logout</a>
	</div>
	<hr>
	<div>${msg }</div>

	<div class="div1">Pet Peers</div>
	<div class="div2">add pet</div>
	<form action="petData" method="post">

		
		 <label>petname:</label>
		<input type="text" name="PET_NAME" required="required">
		 <label>age:</label>
		<input type="text" name="PET_AGE" required="required"> 
		<label>place:</label>
		<input type="text" name="PET_PLACE" required="required"> 
		
			 <input type="submit" value="save">
			 <input
			type="reset" value="cancel">

	</form>
</body>
</html>