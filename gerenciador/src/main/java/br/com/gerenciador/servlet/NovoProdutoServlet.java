package br.com.gerenciador.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		
		Produto produto = new Produto();
		produto.setNome(request.getParameter("nome"));
		produto.setValor(Double.parseDouble(request.getParameter("valor")));
		produto.setQuantidade(Integer.parseInt(request.getParameter("quant")));
		
		Banco banco = new Banco();
		banco.adiciona(produto);
		
		response.sendRedirect("listaProdutos");
		
//		RequestDispatcher rd = request.getRequestDispatcher("/listaProdutos");
//		request.setAttribute("nome", produto.getNome());
//		request.setAttribute("valor", produto.getValor());
//		request.setAttribute("quantidade", produto.getQuantidade());
//		rd.forward(request, response);
	}

}
