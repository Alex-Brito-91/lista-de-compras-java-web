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
		
		BigDecimal valeAlimentacao1 = new BigDecimal(request.getParameter("vale1").replaceAll(",", "."));
		BigDecimal valeAlimentacao2 = new BigDecimal(request.getParameter("vale2").replaceAll(",", "."));
		BigDecimal dinheiro = new BigDecimal(request.getParameter("dinheiro").replaceAll(",", "."));
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		Saldo saldo = banco.buscaIdSaldo(id);
		saldo.setAlimentacao1(valeAlimentacao1);
		saldo.setAlimentacao2(valeAlimentacao2);
		saldo.setDinheiro(dinheiro);
		
		response.sendRedirect("totaisServlet");
		
	}

}
