<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.gerenciador.servlet.Saldo"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Saldo</title>
	<link rel="stylesheet" type="text/css" href="style_lista_saldo.css">
</head>
<body>
	<header class="cabecalho">
		<a class="cabecalho-imagem" href="paginaInicial.jsp"> <img src="imagens/shopping-basket.png" alt="logo do carrinho"></a>
		<nav class="cabecalho-menu">
			<a class="cabecalho-menu-item" href="paginaInicial.jsp">Página Inicial</a> 
			<a class="cabecalho-menu-item" href="totaisServlet">Cadastro de Produtos</a> 
			<a class="cabecalho-menu-item" href="listaProdutos">Lista de Produtos</a>
		</nav>
	</header>
	
	<main class="conteudo">
		<section class="conteudo-principal-tabela">
			<div class="conteudo-principal-tabela-div">
				<h1 class="conteudo-principal-tabela-tema">SALDO</h1>
				<table class="tabela">
					<thead>
						<tr class="itens-cabecalho-tabela">
							<th class="cabecalho-tabela">ALIMENTAÇÃO 1</th>
							<th class="cabecalho-tabela">ALIMENTAÇÃO 2</th>
							<th class="cabecalho-tabela">DINHEIRO</th>
							<th class="cabecalho-tabela">&nbsp;</th>
							<th class="cabecalho-tabela">&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${saldos}" var="saldo">
							<tr class="itens-conteudo-tabela">
								<td class="conteudo-tabela">${saldo.alimentacao1}</td>
								<td class="conteudo-tabela">${saldo.alimentacao2}</td>
								<td class="conteudo-tabela">${saldo.dinheiro}</td>
								<td class="conteudo-tabela">
									<a class="botao-alterar"href="/gerenciador/mostraSaldo?id=${saldo.id}">alterar</a>
								</td>
								<td class="conteudo-tabela">
									<a class="botao-excluir"href="/gerenciador/removeSaldo?id=${saldo.id}">excluir</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<h2 class="conteudo-principal-tabela-total">
					Saldo Total: <b><em>${saldoTotal}</em></b><br>
				</h2>
				<section class="section-botao-voltar">
					<button class="botao-voltar" onclick="history.back()">voltar</button><br>
					<a href="totaisServlet">
						<input class="botao-cadastro" type="button" value="cadastrar produtos" /><br>
					</a>
				</section>
			</div>
		</section>
	</main>
	
	<footer class="rodape"> </footer>
</body>
</html>