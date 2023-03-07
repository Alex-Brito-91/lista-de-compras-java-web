package br.com.gerenciador.servlet;

import java.io.IOException;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaProdutos")
public class ListaProdutosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("criando lista de produtos");
		
		Banco banco = new Banco();
		Date dataLista = new Date();
		List<Produto> produtos = banco.getProdutos();
		
		String totalF = DecimalFormat.getCurrencyInstance().format(banco.totalCompra());
		String saldoF = DecimalFormat.getCurrencyInstance().format(banco.saldoTotal());
		String restanteF = DecimalFormat.getCurrencyInstance().format(banco.saldoRestante());
		
		request.setAttribute("data", dataLista);
		request.setAttribute("produtos", produtos);
		request.setAttribute("totalCompra", totalF);
		request.setAttribute("saldoTotal", saldoF);
		request.setAttribute("totalRestante", restanteF);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaProdutos.jsp");
		rd.forward(request, response);
		
	}

}
