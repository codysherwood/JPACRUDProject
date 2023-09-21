<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Super Hero</title>
</head>
<a href="home.do"><button>Home</button></a>
<br>
<body>
${hero.name} <br>
Height In Inches:${hero.heightInInches}<br>
Weight In Pounds:${hero.weightInPounds}<br>
 <img src="${hero.imageUrl}">
${hero.description}
<br>
<form action="updateHero.do" method="post">
		<h3>Update Hero</h3>
		<br>

		<input type="hidden" value=${hero.id} name="id">
		Name:
		<input type="text" value=${hero.name} name="name" required="required field"><br>
		Height In Inches:
		<input type="number" value=${hero.heightInInches} name="heightInInches"><br>
		Weight In Pounds:
		<input type="number" value=${hero.weightInPounds} name="weightInPounds"><br>
		Description:
		<input type="textarea" value=${hero.description} name="description"><br>
		Image URL:
		<input type="text" value=${hero.imageUrl} name="imageUrl"><br>
		
		<br><button>Update ${hero.name}</button>
	</form>
<br>
<a href="deleteHero.do?heroId=${hero.id}"><button style="background-color: red; border-coler: black; color: white"> Delete ${hero.name}</button></a>
</body>
</html>