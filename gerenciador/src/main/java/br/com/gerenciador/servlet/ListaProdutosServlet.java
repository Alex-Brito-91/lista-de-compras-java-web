package br.com.gerenciador.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
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

    protected void service(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        System.out.println("criando lista de produtos");
    	
    	Banco banco = new Banco();
    	LocalDate dataLista = LocalDate.now();
    	DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    	String dataFormatada = dataLista.format(formatter);
        List<Produto> produtos = banco.getProdutos();
        BigDecimal totalCompra = banco.totalCompra();
        BigDecimal saldoTotal = banco.saldoTotal();
        BigDecimal saldoRestante = banco.saldoRestante();

        request.setAttribute("data", dataFormatada);
        request.setAttribute("produtos", produtos);
        request.setAttribute("totalCompra", totalCompra);
        request.setAttribute("saldoTotal", saldoTotal);
        request.setAttribute("saldoRestante", saldoRestante);

        RequestDispatcher rd = request.getRequestDispatcher("/listaProdutos.jsp");
        rd.forward(request, response);
    }
}
