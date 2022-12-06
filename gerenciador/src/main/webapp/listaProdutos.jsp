<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.util.List, br.com.gerenciador.servlet.Produto"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    

<!DOCTYPE html>
	<html lang="pt-br">
		<head>
			<meta charset="UTF-8">
			<title>Lista de Produtos</title>
			<link rel="stylesheet" href="style.css">
		</head>
		<body>
			<c:if test="${not empty nome}">
				Produto ${nome} cadastrado com sucesso!
			</c:if><br>
			<div> 
				<h1>LISTA DE PRODUTOS<br /></h1>
				
				<h2>Lista Criada em: <em><fmt:formatDate value="${data}" pattern="dd/MM/yyyy"/></em></h2>
				
						<table>
							<thead>
								<tr>
									<th>NOME</th>
									<th>VALOR UN</th>
									<th>QUANT.</th>
									<th>TOTAL</th>
									<th>&nbsp</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${produtos}" var="produto">
									<tr>
										<td>${produto.nome}</td>
										<td>${produto.valor}</td> 
										<td>${produto.quantidade}</td>
										<td>${produto.valorTotal}</td>
										<td>
											<a href="/gerenciador/mostraProduto?id=${produto.id}">alterar</a>  
											<a href="/gerenciador/removeProduto?id=${produto.id}">excluir</a>
										</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
						<h3>Total da compra: <em>${totalCompra}</em></h3> 
						<a href="/gerenciador/formNovoProduto.jsp" style="">voltar ao cadastro</a>
			</div>
		</body>
	</html>