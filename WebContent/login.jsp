<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="css/block/form.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<title>Servlet Project</title>
</head>
<body>
	<div class="container">
		<h1 class="title-page">Servlet Project - Empresas</h1>
		<h2 class="subTitle-page">Bem vindo ao Gerenciador de Empresas</h2>
		<p class="description">Projeto desenvolvido em Java usando conceitos de Servlets e fundamentos da web<p>
		<form class="form" action="login" method="POST">
			<h2 class="description">Login</h2>
			<label>Login</label>
			<input type="email"class="field-form field-large" name="email">
			<br>
			<label>Senha</label>
			<input type="password"class="field-form field-large" name="senha">
			<button class="button" type="submit">Enviar</button>
			<br>
			${login.email}
		</form>
	</div>
</body>
</html>