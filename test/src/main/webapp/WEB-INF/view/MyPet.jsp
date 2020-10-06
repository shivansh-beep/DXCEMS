<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<html>

<body>
<div>
<div align="right"><a href="pet_home">home</a>   <a href="Logout">Logout</a></div>
<hr>


<h4 align="center">Pet Peers</h4>
<div>

	<table>
		<tr>
			<th style="color: red"><center>#</center></th>
			<th style="color: red"><center>Pet Name</center></th>
			<th style="color: red"><center>Place</center></th>
			<th style="color: red"><center>Age</center></th>

		</tr>
		<c:forEach var="mdto" items="${myPetList }">

			<tr>
				<td><center>${mdto.getID()}</center></td>
				<td><center>${mdto.getPET_NAME()}</center></td>
				<td><center>${mdto.getPET_PLACE()}</center></td>
				<td><center>${mdto.getPET_AGE()}</center></td>

			</tr>
		</c:forEach>
	</table>
	<h4>${msg }</h4>
</div>
</div>
</body>

</html>


