<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.List, br.com.gerenciador.servlet.Produto"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<!DOCTYPE html>
<html lang="pt-br">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<title>Lista de Produtos</title>
	<link rel="stylesheet" type="text/css" href="style_lista.css">
</head>
<body>
	<header class="cabecalho">
		<a class="cabecalho-imagem" href="paginaInicial.jsp"> <img src="shopping-basket.png" alt="logo do carrinho"></a>
		<nav class="cabecalho-menu">
			<a class="cabecalho-menu-item" href="paginaInicial.jsp">Página Inicial</a> 
			<a class="cabecalho-menu-item" href="formSaldo.jsp">Seu Saldo</a>
			<a class="cabecalho-menu-item" href="formNovoProduto.jsp">Cadastro de Produtos</a> 
		</nav>
	</header>
	
	<main class="conteudo">
		<section class="conteudo-principal-tabela">
			<div class="conteudo-principal-tabela-div">
				<h1 class="conteudo-principal-tabela-tema">LISTA DE PRODUTOS</h1>
				<h2> Lista Criada em: 
					<em><fmt:formatDate value="${data}" pattern="dd/MM/yyyy"/></em>
				</h2>
				<table class="tabela">
					<thead>
						<tr class="itens-cabecalho-tabela">
							<th class="cabecalho-tabela">NOME</th>
							<th class="cabecalho-tabela">VALOR UN</th>
							<th class="cabecalho-tabela">QT</th>
							<th class="cabecalho-tabela">TOTAL</th>
							<th class="cabecalho-tabela">&nbsp;</th>
							<th class="cabecalho-tabela">&nbsp;</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${produtos}" var="produto">
							<tr class="itens-conteudo-tabela">
								<td class="conteudo-tabela">${produto.nome}</td>
								<td class="conteudo-tabela">${produto.getValorUnString()}</td>
								<td class="conteudo-tabela">${produto.quantidade}</td>
								<td class="conteudo-tabela">${produto.getValorTotalString()}</td>
								<td class="conteudo-tabela">
									<a class="botao-alterar"href="/gerenciador/mostraProduto?id=${produto.id}">alterar</a>
								</td>
								<td class="conteudo-tabela">
									<a class="botao-excluir"href="/gerenciador/removeProduto?id=${produto.id}">excluir</a>
								</td>
							</tr>
						</c:forEach>
					</tbody>
				</table>
				<h3 class="conteudo-principal-tabela-total">Total da compra: <em>${totalCompra}</em></h3>
				<section class="section-botao-voltar">
					<a href="/gerenciador/formNovoProduto.jsp">
						<button class="botao-voltar">voltar ao cadastro</button>
					</a>
				</section>
			</div>
		</section>
	</main>
	
	<footer class="rodape"> </footer>
</body>
</html>