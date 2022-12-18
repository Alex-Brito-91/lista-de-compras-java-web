<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novoProduto" var="linkServletNovoProduto"/>

<!DOCTYPE html>
	<html>
		<head>
			<meta charset="UTF-8">
			<title>Cadastro de Produto</title>
			<link rel="stylesheet" href="style_novo.css">
		</head>
		
		<body>
			<div>
				<br><h1>Cadastrar Produtos</h1>
				<form action="${linkServletNovoProduto}" method="post"><br>
					Nome: <input type="text" name="nome"/><br/>
					<br>Valor: <input type="text" name="valor"/><br/>
					<br>Quantidade: <input type="text" name="quant"/><br/>
						<section>
							<input type="submit" value="cadastrar"/>
						</section>
				</form>
					<a href="/gerenciador/listaProdutos"><button>exibir lista</button></a><br/>
					<br><h2>Total da compra: <em>R$${totalCompra}</em></h2>
			</div>
		</body>
	</html>