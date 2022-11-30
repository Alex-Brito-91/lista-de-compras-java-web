<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/alteraProduto" var="linkServletNovoProduto"/>

<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Cadastro de Produto</title>
		</head>
		
		<body>
			<div align="center">
				<form action="${linkServletNovoProduto}" method="post"><br>
					Nome: <input type="text" name="nome" value="${produto.nome}"/><br>
					Valor: <input type="text" name="valor" value="${produto.valor}"/><br>
					Quantidade: <input type="text" name="quant" value="${produto.quantidade}"/><br>
					<input type="hidden" name="id" value="${produto.id}"><br>
					<input type="submit" value="alterar"/><br>
				</form>
					<a href="/gerenciador/listaProdutos">exibir lista</a>
			</div>
		</body>
	</html>