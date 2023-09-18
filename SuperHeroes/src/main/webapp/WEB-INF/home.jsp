<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Super Heroes</title>
</head>
<body>
	<h1>Super Hero Database</h1>

	<form action="getHero.do" method="get">
		Get Hero By ID: <input type="number" name="id">
		<button>Display Hero</button>
	</form>

	<form action="createHero.do" method="get">
		<h3>Create Hero</h3>
		<br>

		Name:
		<input type="text" name="name" required="required field"><br>
		Height In Inches:
		<input type="number" name="heightInInches"><br>
		Weight In Pounds:
		<input type="number" name="weightInPounds"><br>
		Description:
		<input type="text" name="description"><br>
		Image URL:
		<input type="text" name="imageUrl"><br>
		
		<br><button>Create Hero</button>
	</form>
	<br>
	<table>
	<thead>
	<tr>
	<th>Id</th>
	<th>Hero</th>
	
	</tr>
	</thead>
		<tbody>
			<c:forEach var="hero" items="${heroList}">
				<tr>
					<td>${hero.id }</td>
					<td><a href="getHero.do?id=${hero.id}">${hero.name}<br><img src="${hero.imageUrl}" width="90"></a></td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>