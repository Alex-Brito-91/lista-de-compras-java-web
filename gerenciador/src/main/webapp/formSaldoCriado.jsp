<%@ page language="java" %>
<%@ page import="java.math.BigDecimal" %>

<%
	BigDecimal saldoAlimentacao1 = (BigDecimal)request.getAttribute("vale1");
	System.out.println(saldoAlimentacao1);
	
	BigDecimal saldoAlimentacao2 = (BigDecimal)request.getAttribute("vale2");
	System.out.println(saldoAlimentacao2);
	
	BigDecimal saldoDinheiro = (BigDecimal)request.getAttribute("dinheiro");
	System.out.println(saldoDinheiro);
%>

<!DOCTYPE html>
<html lang="pt-BR">
<head>
	<meta charset="UTF-8">
	<meta name="viewport" content="width=device-width, initial-scale=1.0">
	<link rel="stylesheet" type="text/css" href="style_saldo_criado.css">
	<title>Saldo Criado</title>
</head>
<body>
	<main class="conteudo-saldo-criado">
		<section class="conteudo-saldo-section">
			<div class="conteudo-saldo-div">
				    <h1 class="conteudo-saldo-tema">Saldo para Compras</h1>
					<p>Vale Alimentação 1: <%= saldoAlimentacao1 %> </p>
					<p>Vale Alimentação 2: <%= saldoAlimentacao1 %> </p>
					<p>Dinheiro: <%= saldoDinheiro %> </p>
			</div>
		</section>
	</main>
</body>
</html>