<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/alteraProduto" var="linkServletNovoProduto"/>

<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Cadastro de Produto</title>
			<link rel="stylesheet" href="style_altera.css">
		</head>
		
		<body>
			<div>
				<h1>Alterar Produto</h1>
				<form action="${linkServletNovoProduto}" method="post"><br>
					Nome: <input type="text" name="nome" value="${produto.nome}"/><br>
					Valor: <input type="text" name="valor" value="${produto.valorUnitario}"/><br>
					Quantidade: <input type="text" name="quant" value="${produto.quantidade}"/><br>
					<input type="hidden" name="id" value="${produto.id}"><br>
						<section>
							<input type="submit" value="alterar"/><br>
						</section>
				</form>
			</div>
		</body>
	</html>