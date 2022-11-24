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
			<div align="center"> 
				<h2>LISTA DE PRODUTOS: <br /></h2>
				
				<h3>DATA DA LISTA: <fmt:formatDate value="${data}" pattern="dd/MM/yyyy"/>  <br /></h3>
					
						<table border="1">
							<thead>
								<tr>
									<th>NOME</th>
									<th>VALOR</th>
									<th>QUANT.</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${produtos}" var="produto">
									<tr>
										<td>${produto.nome}</td>
										<td>${produto.valor}</td> 
										<td>${produto.quantidade}</td>
									</tr>
								</c:forEach>
							</tbody>
						</table>
					
			</div>
		</body>
	</html>