<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/saldo" var="linkServletSaldo"/>

<!DOCTYPE html>
	<html lang="pt-BR">
		<head>
			<meta charset="UTF-8">
			<meta name="viewport" content="width=device-width, initial-scale=1.0">
			<title>Saldo</title>
			<link rel="stylesheet" type="text/css" href="style_saldo.css">
		</head>
		
		<body>
			<div>
				<br><h1>Saldo para Compras</h1>
				<form action="${linkServletSaldo}" method="post"><br>
					Vale Alimentação 1: <input type="text" name="nome"/><br/>
					<br>Vale Alimentação 2: <input type="text" name="valor"/><br/>
					<br>Dinheiro: <input type="text" name="quant"/><br/>
						<section>
							<input type="submit" value="cadastrar"/>
						</section>
				</form>
			</div>
		</body>
	</html>