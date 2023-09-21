<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<c:choose>
		 <c:when test="${deleted == true}"> 
		 ${hero.name} has been deleted<br>
		 
		 <br>
	 	</c:when> 
		<c:otherwise>
		ERROR: your hero has not been deleted
		</c:otherwise>
	</c:choose>
<a href="home.do"><button>Home</button></a>
</body>
</html>