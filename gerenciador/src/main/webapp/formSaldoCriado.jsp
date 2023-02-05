<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import= "java.util.List, br.com.gerenciador.servlet.Saldo"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="style_saldo_criado.css">
	<title>Saldo Criado</title>
</head>
<body>
	<header class="cabecalho">
		<a class="cabecalho-imagem" href="paginaInicial.jsp">  <img src="shopping-basket.png" alt="logo do carrinho"></a>		
		<nav class="cabecalho-menu">
			<a class="cabecalho-menu-item" href="paginaInicial.jsp">Página Inicial</a> 
			<a class="cabecalho-menu-item" href="formNovoProduto.jsp">Cadastro de Produtos</a> 
			<a class="cabecalho-menu-item" href="listaProdutos.jsp">Lista de Produtos</a>
		</nav>
	</header>

	<main class="conteudo">
		<section class="conteudo-saldo">
			<div class="conteudo-saldo-div">
				<br><h1 class="conteudo-saldo-tema">Saldo para Compras</h1>
					Vale Alimentação 1: ${saldo.alimentacao1} <br/>
					<br>Vale Alimentação 2: ${saldo.alimentacao2} <br/>
					<br>Dinheiro: ${saldo.dinheiro} <br/>
			</div>
		</section>
	</main>

	<footer class="rodape"> </footer>
</body>
</html>