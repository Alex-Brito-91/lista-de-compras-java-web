package br.com.gerenciador.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alteraSaldo")
public class AlteraSaldoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("alterando saldo");
		
		BigDecimal valeAlimentacao1 = toBigDecimal(request.getParameter("vale1"));
		BigDecimal valeAlimentacao2 = toBigDecimal(request.getParameter("vale2"));
		BigDecimal dinheiro = toBigDecimal(request.getParameter("dinheiro"));
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		Saldo saldo = banco.buscaIdSaldo(id);
		saldo.setAlimentacao1(valeAlimentacao1);
		saldo.setAlimentacao2(valeAlimentacao2);
		saldo.setDinheiro(dinheiro);
		
		response.sendRedirect("listaSaldo");
		
	}

	private BigDecimal toBigDecimal(String value) {
		if (value == null || value.trim().isEmpty()) {
			return BigDecimal.ZERO;
		}
		return new BigDecimal(value.replaceAll(",", "."));
	}

}
