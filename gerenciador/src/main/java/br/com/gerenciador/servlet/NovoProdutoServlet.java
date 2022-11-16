package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

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
		
//		String nomeProduto = request.getParameter("nome");
//		double valorProduto = Double.parseDouble(request.getParameter("valor"));
//		Integer quantProduto = Integer.parseInt(request.getParameter("quant"));
		
		Produto produto = new Produto();
		produto.setNome(request.getParameter("nome"));
//		produto.setValor(valorProduto);
//		produto.setQuantidade(quantProduto);
		
		Banco banco = new Banco();
		banco.adiciona(produto);
		
		PrintWriter out = response.getWriter();
		out.println("<html><body>produto " + produto.getNome() + " cadastrado com sucesso!</body></html>");
	}

}
