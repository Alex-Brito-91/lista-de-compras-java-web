<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/alteraProduto" var="linkServletNovoProduto" />

<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Cadastro de Produto</title>
	<link rel="stylesheet" type="text/css" href="style_altera_produto.css">
</head>

<body>
	<header class="cabecalho">
		<a class="cabecalho-imagem" href="paginaInicial.jsp"> <img
			src="imagens/shopping-basket.png" alt="logo do carrinho"></a>
	</header>
	<main class="conteudo">
		<section class="conteudo-altera-section">
			<div class="conteudo-altera-div">
				<h1 class="conteudo-altera-tema">Alterar Produto</h1>
				<form class="conteudo-altera-form" action="${linkServletNovoProduto}" method="post">
					<div class="div-input-nome">
						Nome<br>
						<input class="conteudo-altera-input-nome" type="text" name="nome" value="${produto.nome}" />
					</div>
					<div class="div-input-valor">
						Valor<br>
						<input class="conteudo-altera-input-valor" type="text" name="valor" value="${produto.valorUnitario}" />
					</div>
					<div class="div-input-quant">
						Quantidade<br>
						<input class="conteudo-altera-input-quant" type="text" name="quant" value="${produto.quantidade}" />
					</div>
					<input type="hidden" name="id" value="${produto.id}"><br>
					<div class="conteudo-altera-botoes">
						<button class="conteudo-altera-voltar" onclick="history.back()">voltar</button><br>
						<input class="conteudo-altera-input" type="submit" value="alterar" /><br>
					</div>
				</form>
			</div>
		</section>
	</main>

	<footer class="rodape"> </footer>
</body>
</html>