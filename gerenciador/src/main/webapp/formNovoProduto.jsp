<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novoProduto" var="linkServletNovoProduto"/>

<!DOCTYPE html>
	<html lang="pt-br">
		<head>
			<meta charset="UTF-8">
			<title>Cadastro de Produto</title>
			<link rel="stylesheet" href="style_novo.css">
		</head>
		
		<body>
			<div>
				<br><h1>Saldo Alimenta��o</h1>
				<form action="${linkServletNovoProduto}" method="post"><br>
					Alimenta��o 1: <input type="text" name="valor1"/><br/>
					<br>Alimenta��o 2: <input type="text" name="valor2"/><br/>
					<br><input type="submit" value="cadastrar"/>
				</form>
			</div>
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
			</div>
		</body>
	</html>