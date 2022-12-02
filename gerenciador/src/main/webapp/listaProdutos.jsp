<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.util.List, br.com.gerenciador.servlet.Produto"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>    

<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Lista de Produtos</title>
		</head>
		<body>
			<c:if test="${not empty nome}">
				Produto ${nome} cadastrado com sucesso!
			</c:if><br>
			<div align="center"> 
				<h2>LISTA DE PRODUTOS<br /></h2>
				
				<h3>DATA DA LISTA: <fmt:formatDate value="${data}" pattern="dd/MM/yyyy"/>  <br /></h3>
				
						<table border="1">
							<thead>
								<tr>
									<th>NOME</th>
									<th>VALOR UN</th>
									<th>QUANT.</th>
									<th>TOTAL</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${produtos}" var="produto">
									<tr>
										<td>${produto.nome}</td>
										<td align="center">${produto.valor}</td> 
										<td align="center">${produto.quantidade}</td>
										<td align="center">${produto.valorTotal}</td>
										<td><a href="/gerenciador/mostraProduto?id=${produto.id}">editar</a></td>
										<td><a href="/gerenciador/removeProduto?id=${produto.id}">remover</a></td>
									</tr>
								</c:forEach>
							</tbody>
							<tfoot>
								<tr>
									<td>TOTAL DA COMPRA: </td>
								</tr>
							</tfoot>
						</table><br>
						<a href="/gerenciador/formNovoProduto.jsp">voltar ao cadastro</a>
			</div>
		</body>
	</html>