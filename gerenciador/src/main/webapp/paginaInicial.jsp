<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<meta name="description" content="Um site para facilitar na hora de criar sua lista de compras">
	<title>Pagina Inicial</title>
	<link rel="stylesheet" type="text/css" href="style.css">
</head>
	<body>
		<header class="cabecalho">
			<img class="cabecalho-imagem"src="shopping-basket.png" alt="logo do carrinho">
			<nav class="cabecalho-menu">
				<a class="cabecalho-menu-item">Seu Saldo</a>
				<a class="cabecalho-menu-item" href="formNovoProduto.jsp">Cadastro de Produtos</a>
				<a class="cabecalho-menu-item" href="listaProdutos.jsp">Lista de Produtos</a>
			</nav>
		</header>
		
		<main class="conteudo">
			<section class="conteudo-principal">
				<div class="conteudo-principal-escrito">
					<h1 class="conteudo-principal-escrito-titulo">Lista de Compras</h1>
					<h2 class="conteudo-principal-escrito-subtitulo">Uma lista para cadastrar e calcular suas compras</h2>
					<button class="conteudo-principal-escrito-botao">Começar!</button>
				</div>
				<img class="conteudo-principal-imagem" alt="carrinho de compras" src="listbasket2.png">
			</section>
			<section class="conteudo-secundario">
				<h3 class="conteudo-secundario-titulo">O que fazer com a lista?</h3>
				<p class="conteudo-secundario-paragrafo">1. Inserir seu <strong>saldo</strong></p>
				<p class="conteudo-secundario-paragrafo">2. <strong>Cadastrar</strong> produtos</p>
				<p class="conteudo-secundario-paragrafo">3. <strong>Ver</strong> lista com produtos</p>
				<p class="conteudo-secundario-paragrafo">4. <strong>Comparar</strong> seu <strong>saldo</strong> com o <strong>total</strong> da compra</p>
			</section>
		
		</main>
		
		<footer class="rodape">
		
		</footer>
	</body>
</html>