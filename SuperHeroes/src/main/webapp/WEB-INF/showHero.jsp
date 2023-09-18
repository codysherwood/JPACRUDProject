<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %> 
    
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Super Hero</title>
</head>
<body>
${hero.name} <br>
Height In Inches:${hero.heightInInches}<br>
Weight In Pounds:${hero.weightInPounds}<br>
 <img src="${hero.imageUrl}">
${hero.description}
</body>
</html>