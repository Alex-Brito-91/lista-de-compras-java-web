<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/saldo" var="linkServletSaldo" />

<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Saldo</title>
	<link rel="stylesheet" type="text/css" href="formSaldo.css">
</head>
<body>
	<header class="cabecalho-saldo">
		<a class="cabecalho-imagem-saldo" href="paginaInicial.jsp"> <img src="shopping-basket.png" alt="logo do carrinho"></a>
		<nav class="cabecalho-menu-saldo">
			<a class="cabecalho-menu-item-saldo" href="paginaInicial.jsp">Página Inicial</a> 
			<a class="cabecalho-menu-item-saldo" href="formNovoProduto.jsp">Cadastro de Produtos</a> 
			<a class="cabecalho-menu-item-saldo" href="listaProdutos.jsp">Lista de Produtos</a>
		</nav>
	</header>

	<main>
		<section class="conteudo-principal">
			<div class="conteudo-principal-div">
				<h1 class="conteudo-principal-tema">Saldo para Compras</h1>
				<form class="conteudo-principal-form"action="${linkServletSaldo}" method="post">
					<br> Vale Alimentação 1: <input type="text" name="vale1" /><br />
					<br>Vale Alimentação 2: <input type="text" name="vale2" /><br />
					<br>Dinheiro: <input type="text" name="dinheiro" /><br />
					<section>
						<input class="botao-cadastrar" type="submit" value="cadastrar" />
					</section>
				</form>
			</div>
		</section>
	</main>

	<footer class="rodape"> </footer>
</body>
</html>