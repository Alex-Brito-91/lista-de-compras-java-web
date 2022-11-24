package br.com.gerenciador.servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaProdutos")
public class ListaProdutosServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Banco banco = new Banco();
		List<Produto> produtos = banco.getProdutos();
		request.setAttribute("produtos", produtos);
		Date dataLista = new Date();
		request.setAttribute("data", dataLista);
		
		RequestDispatcher rd = request.getRequestDispatcher("/listaProdutos.jsp");
		rd.forward(request, response);
		
	}

}
