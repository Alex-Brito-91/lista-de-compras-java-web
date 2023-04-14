package br.com.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/novoProduto")
public class NovoProdutoServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if (!validarParametros(request)) {
			mostrarMensagemDeErro(response);
			return;
		}
		
		System.out.println("cadastrando produto");

		Produto produto = criarNovoProduto(request);
		Banco banco = new Banco();
		banco.adiciona(produto);

		response.sendRedirect("paginaCadastroTotais");
	}

	private boolean validarParametros(HttpServletRequest request) {
		String nome = request.getParameter("nome");
		String valor = request.getParameter("valor");
		String quant = request.getParameter("quant");

		return nome != null && !nome.trim().isEmpty() &&
				valor != null && !valor.trim().isEmpty() &&
				quant != null && !quant.trim().isEmpty();
	}

	private void mostrarMensagemDeErro(HttpServletResponse response) throws IOException {
		PrintWriter out = response.getWriter();
		out.println("<script type=\"text/javascript\">");
		out.println("alert('Por favor, preencha todos os campos antes de cadastrar!');");
		out.println("window.history.back();");
		out.println("</script>");
	}

	private Produto criarNovoProduto(HttpServletRequest request) {
		String nome = request.getParameter("nome");
		BigDecimal valorUnitario = new BigDecimal(request.getParameter("valor").replaceAll(",", "."));
		Integer quantidade = Integer.parseInt(request.getParameter("quant"));
		BigDecimal valorTotal = valorUnitario.multiply(BigDecimal.valueOf(quantidade));

		Produto produto = new Produto();
		produto.setNome(nome);
		produto.setValorUnitario(valorUnitario);
		produto.setQuantidade(quantidade);
		produto.setValorTotal(valorTotal);

		return produto;
	}
}
