<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novoProduto" var="linkServletNovoProduto"/>

<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Cadastro de Produto</title>
		</head>
		
		<body>
			<div align="center">
				<form action="${linkServletNovoProduto}" method="post"><br>
					Nome: <input type="text" name="nome"/><br>
					Valor: <input type="text" name="valor"/><br>
					Quantidade: <input type="text" name="quant"/><br>
					<br><input type="submit" value="cadastrar"/>
				</form><br>
					<a href="/gerenciador/listaProdutos">exibir lista</a>
			</div>
		</body>
	</html>