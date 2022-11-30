package br.com.gerenciador.servlet;

import java.io.IOException;
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
		
		String nomeProduto = request.getParameter("nome");
		double valorProduto = Double.parseDouble(request.getParameter("valor"));
		Integer quantProduto = Integer.parseInt(request.getParameter("quant"));
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		System.out.println(id);
		
		Banco banco = new Banco();
		Produto produto = banco.buscaIdProduto(id);
		produto.setNome(nomeProduto);
		produto.setValor(valorProduto);
		produto.setQuantidade(quantProduto);
		
		response.sendRedirect("listaProdutos");
		
		
	}

}
