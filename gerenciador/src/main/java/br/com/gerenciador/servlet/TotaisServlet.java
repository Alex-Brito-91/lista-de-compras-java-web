package br.com.gerenciador.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/paginaCadastroTotais")
public class TotaisServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		
		BigDecimal saldo = (banco.saldoTotal());
		BigDecimal total = (banco.totalCompra());
		BigDecimal restante = (banco.saldoRestante());
		
		request.setAttribute("saldo", saldo);
		request.setAttribute("total", total);
		request.setAttribute("restante", restante);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formNovoProduto.jsp");
		rd.forward(request, response);
		
	}

}
