<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Servlet Project</title>
</head>
<body>
	<p>Lista de Empresas: </p>
	<ul class="form">
		<c:forEach var="empresa" items="${empresas}">
			<li>${empresa.id} : ${empresa.nome}</li>
		</c:forEach>
	</ul>
</body>
</html>