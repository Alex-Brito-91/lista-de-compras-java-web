<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:url value="/novoProduto" var="linkServletNovoProduto" />

<!DOCTYPE html>
<html lang="en">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="style_novo.css">
	<title>Cadastro de Produto</title>
</head>
<body>
	<header class="cabecalho">
		<a class="cabecalho-imagem" href="paginaInicial.jsp">  <img src="shopping-basket.png" alt="logo do carrinho"></a>		
		<nav class="cabecalho-menu">
			<a class="cabecalho-menu-item" href="paginaInicial.jsp">P�gina Inicial</a> 
			<a class="cabecalho-menu-item" href="formSaldo.jsp">Seu Saldo</a> 
			<a class="cabecalho-menu-item" href="listaProdutos.jsp">Lista de Produtos</a>
		</nav>
	</header>

	<main class="conteudo">
		<section class="conteudo-cadastro">
			<div class="conteudo-cadastro-div">
				<h1 class="conteudo-cadastro-tema">Cadastrar Produtos</h1>
				<form class="conteudo-cadastro-form" action="${linkServletNovoProduto}" method="post">
					<div class="div-input-nome">
						Nome<br>
						<input class="conteudo-cadastro-input-nome" type="text" name="nome" /> 
					</div>
					
					<div class="div-input-valor">
						Valor<br>
						<input class="conteudo-cadastro-input-valor" type="text" name="valor" /> 
					</div>
				
					<div class="div-input-quant">
						Quantidade<br>
						<input class="conteudo-cadastro-input-quant" type="text" name="quant" />
					</div>
					<section class="conteudo-cadastro-botao">
						<input class="botao-input-cadastrar"type="submit" value="cadastrar" />
					</section>
				</form>
			</div>
		</section>

	</main>

	<footer class="rodape"> </footer>
</body>
</html>