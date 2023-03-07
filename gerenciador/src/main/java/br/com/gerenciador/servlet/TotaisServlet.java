package br.com.gerenciador.servlet;

import java.io.IOException;
import java.text.DecimalFormat;

import javax.servlet.RequestDispatcher;
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
		
		String totalF = DecimalFormat.getCurrencyInstance().format(banco.totalCompra());
		String saldoF = DecimalFormat.getCurrencyInstance().format(banco.saldoTotal());
		String restanteF = DecimalFormat.getCurrencyInstance().format(banco.saldoRestante());
		
		request.setAttribute("total", totalF);
		request.setAttribute("saldo", saldoF);
		request.setAttribute("restante", restanteF);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formNovoProduto.jsp");
		rd.forward(request, response);
		
	}

}
