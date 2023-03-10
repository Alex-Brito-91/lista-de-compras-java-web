<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/alteraSaldo" var="linkServletSaldo" />

<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Saldo</title>
	<link rel="stylesheet" type="text/css" href="style_altera_saldo.css">
</head>
<body>
	<header class="cabecalho-saldo">
		<a class="cabecalho-imagem-saldo" href="paginaInicial.jsp"> <img src="shopping-basket.png" alt="logo do carrinho"></a>
	</header>

	<main class="conteudo">
		<section class="conteudo-principal">
			<div class="conteudo-principal-div">
				<h1 class="conteudo-principal-tema">Saldo para Compras</h1>
				<form class="conteudo-principal-form"action="${linkServletSaldo}" method="post">
					<div class="div-input-alimentacao1">
						<br> Vale Alimentação 1: <input class="conteudo-principal-input-alimentacao1" type="text" name="vale1" value="${saldo.alimentacao1}" /><br />
					</div>
					<div class="div-input-alimentacao2">
						<br>Vale Alimentação 2: <input class="conteudo-principal-input-alimentacao2" type="text" name="vale2" value="${saldo.alimentacao2}" /><br />
					</div>
					<div class="div-input-dinheiro">
						<br>Dinheiro: <input class="conteudo-principal-input-dinheiro" type="text" name="dinheiro" value="${saldo.dinheiro}" /><br />
					</div>
					<input type="hidden" name="id" value="${saldo.id}"><br>
					<div class="conteudo-altera-botoes">
						<button class="conteudo-altera-voltar" onclick="history.back()">voltar</button><br>
						<input class="conteudo-altera-input" type="submit" value="alterar" />
					</div>
				</form>
			</div>
		</section>
	</main>

	<footer class="rodape"> </footer>
</body>
</html>