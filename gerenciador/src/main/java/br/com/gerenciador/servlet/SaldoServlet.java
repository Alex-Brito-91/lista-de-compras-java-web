package br.com.gerenciador.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.text.DecimalFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/saldo")
public class SaldoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("cadastrando novo saldo");
		
		BigDecimal valeAlimentacao1 = new BigDecimal(request.getParameter("vale1").replaceAll(",", "."));
		BigDecimal valeAlimentacao2 = new BigDecimal(request.getParameter("vale2").replaceAll(",", "."));
		BigDecimal dinheiro = new BigDecimal(request.getParameter("dinheiro").replaceAll(",", "."));
		
		BigDecimal saldoTotal = valeAlimentacao1.add(valeAlimentacao2).add(dinheiro);
		String totalFormatado = DecimalFormat.getCurrencyInstance().format(saldoTotal);
				
		Saldo saldo = new Saldo();
		saldo.setAlimentação1(valeAlimentacao1);
		saldo.setAlimentacao2(valeAlimentacao2);
		saldo.setDinheiro(dinheiro);
		
		Banco banco = new Banco();
		banco.adicionaSaldo(saldo);
		
		RequestDispatcher rd = request.getRequestDispatcher("/formSaldoCriado.jsp");
		request.setAttribute("vale1", saldo.getAlimentação1());
		request.setAttribute("vale2", saldo.getAlimentacao2());
		request.setAttribute("dinheiro", saldo.getDinheiro());
		request.setAttribute("total", totalFormatado);
		rd.forward(request, response);
		
	}
	
}
