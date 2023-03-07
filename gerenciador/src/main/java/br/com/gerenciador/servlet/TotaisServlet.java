package br.com.gerenciador.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/totaisServlet")
public class TotaisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("calculando totais de saldo e compra");
		
		Banco banco = new Banco();
		List<Produto> produtos = banco.getProdutos();
		List<Saldo> saldo = banco.getSaldo();
		
		BigDecimal totalCompra = new BigDecimal(banco.totalCompra());
		BigDecimal totalSaldo = new BigDecimal(banco.saldoTotal());
		BigDecimal saldoRestante = totalCompra.subtract(totalSaldo);
		
		request.setAttribute("valorCompra", totalCompra);
		request.setAttribute("valorSaldo", totalSaldo);
		request.setAttribute("restante", saldoRestante);
		
		response.sendRedirect("formNovoProduto.jsp");
		
	}

}
