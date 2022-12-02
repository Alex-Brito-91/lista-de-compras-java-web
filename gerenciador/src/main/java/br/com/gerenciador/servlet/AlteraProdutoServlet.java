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
		
		String paramId = request.getParameter("id");
		Integer id = Integer.valueOf(paramId);
		
		Banco banco = new Banco();
		Produto produto = banco.buscaIdProduto(id);
	
		produto.setNome(request.getParameter("nome"));
		produto.setValor(Double.parseDouble(request.getParameter("valor")));
		produto.setQuantidade(Integer.parseInt(request.getParameter("quant")));
		produto.setValorTotal(Double.parseDouble(request.getParameter("valor")) * Integer.parseInt(request.getParameter("quant")));
		
		response.sendRedirect("listaProdutos");
		
		
	}

}
