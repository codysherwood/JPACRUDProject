<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Updated Hero Display</title>
</head>
<body>
	<c:choose>
		 <c:when test="${not empty hero}"> 
		 ${hero.name} has been updated<br>
		 hero id is ${hero.id}<br>
		 
		 <br>
		 <a href="deleteHero.do?heroId=${hero.id}"><button style="background-color: red; border-coler: black; color: white"> Delete ${hero.name}</button></a>
	 	</c:when> 
		<c:otherwise>
		ERROR: your hero has not been updated
		</c:otherwise>
	</c:choose><br>
	<br>
<a href="home.do"><button>Home</button></a>
</body>
</html>