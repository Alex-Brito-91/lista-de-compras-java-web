package br.com.gerenciador.servlet;

import java.io.IOException;
import java.math.BigDecimal;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novoProduto")
public class NovoProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("cadastrando novo produto");
		
		String nome = request.getParameter("nome");
		BigDecimal valorUnitario = new BigDecimal(request.getParameter("valor"));
		Integer quantidade = Integer.parseInt(request.getParameter("quant"));
		BigDecimal valorTotal = valorUnitario.multiply(BigDecimal.valueOf(quantidade));
		
		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setValorUnitario(valorUnitario);
		produto.setQuantidade(quantidade);
		produto.setValorTotal(valorTotal);
		
		Banco banco = new Banco();
		banco.adiciona(produto);
		
		request.setAttribute("nome", produto.getNome());
		request.setAttribute("valor", produto.getValorUnitario());
		request.setAttribute("quantidade", produto.getQuantidade());
		request.setAttribute("total", produto.getValorTotal());
		
		response.sendRedirect("listaProdutos");
		
	}

}
