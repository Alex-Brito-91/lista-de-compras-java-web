<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import= "java.util.List, br.com.gerenciador.servlet.Produto"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Lista de Produtos</title>
		</head>
		<body>
			Lista de Produtos: <br />
			Data da Lista: <c:>${produto.dataLista}</c:>
			<ul>
				<c:forEach items="${produtos}" var="produto">
					<li>Nome: ${produto.nome} Valor: ${produto.valor} Quantidade: ${produto.quantidade}</li>
				</c:forEach>
			</ul>
		</body>
	</html>