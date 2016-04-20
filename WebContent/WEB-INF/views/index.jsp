<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/block/form.css">
<link rel="stylesheet" type="text/css" href="css/style.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Servlet Project</title>
</head>
<body>
	<div class="container">
		<h1 class="title-page">Olá ${usuario.email}</h1>
		<form action="logout" method="POST">
			<button class="button buttonCenter" type="submit">Deslogar</button>	
		</form>
		<form class="form" action="busca">
			<h2 class="description">Pesquisa</h2>
			<label>Busca Empresa</label>
			<input class="field-form field-large" name="filtro">
			<button class="button" type="submit">Buscar</button>
		</form>
		<a class="button buttonCenter" href="http://localhost:8080/gerenciador/busca">Listar Empresas</a>
		<form class="form" action="novaEmpresa" method="POST">
			<h2 class="description">Cadastro Empresa</h2>
			<label>Nova Empresa</label>
			<input class="field-form field-large" name="nome">
			<br>
			<button class="button" type="submit">Enviar</button>
		</form>
	</div>
</body>
</html>