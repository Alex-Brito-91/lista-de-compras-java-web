package br.com.gerenciador.servlet;

import java.io.IOException;
import java.text.DecimalFormat;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaSaldo")
public class ListaSaldoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("criando lista de saldo");
		
		Banco banco = new Banco();
		List<Saldo> saldos = banco.getSaldo();
		
		String saldoTotal = DecimalFormat.getCurrencyInstance().format(banco.saldoTotal());
		
		request.setAttribute("saldos", saldos);
		request.setAttribute("saldoTotal", saldoTotal);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaSaldos.jsp");
		rd.forward(request, response);
		
	}

}
