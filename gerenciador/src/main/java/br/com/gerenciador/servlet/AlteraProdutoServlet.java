package br.com.gerenciador.servlet;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/alteraProduto")
public class AlteraProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		System.out.println("alterando produto");
		
		String nome = request.getParameter("nome");
		BigDecimal valorUnitario = new BigDecimal(request.getParameter("valor").replaceAll(",", "."));
		Integer quantidade = Integer.parseInt(request.getParameter("quant"));
		BigDecimal valorTotal = valorUnitario.multiply(BigDecimal.valueOf(quantidade));
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		
		Produto produto = banco.buscaIdProduto(id);
		produto.setNome(nome);
		produto.setValorUnitario(valorUnitario);
		produto.setQuantidade(quantidade);
		produto.setValorTotal(valorTotal);
	
		response.sendRedirect("listaProdutos");
		
	}

}
