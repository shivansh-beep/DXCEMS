<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div align="right"><a href="myPets">MyPet</a>  <a href="addPet">Add Pet</a>   <a href="Logout">Logout</a></div>
<hr>

<h4 align="center">Pet Peers</h4>
<div align="center">

	<table border="1">
		<tr>
			<th style="color: red">#</th>
			<th style="color: red">Pet Name</th>
			<th style="color: red">Place</th>
			<th style="color: red">Age</th>
			<th style="color: red">Action</th>

		</tr>
		<c:forEach var="mdto" items="${petList }">

			<tr>
				<td><center>${mdto.getID()}</center></td>
				<td><center>${mdto.getPET_NAME()}</center></td>
				<td><center>${mdto.getPET_PLACE()}</center></td>
				<td><center>${mdto.getPET_AGE()}</center></td>
				<td><center><a href="buy?id=${mdto.getID()}">Buy</a></center></td>

			</tr>
		</c:forEach>
	</table>
</div>

<h5>${msg }</h5>

