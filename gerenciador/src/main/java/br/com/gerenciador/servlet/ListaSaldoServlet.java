package br.com.gerenciador.servlet;

import java.io.IOException;
import java.math.BigDecimal;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/listaSaldo")
public class ListaSaldoServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    	
    	System.out.println("criando saldos");
    	
        Banco banco = new Banco();
        List<Saldo> saldos = banco.getSaldo();

        BigDecimal saldoTotal = banco.saldoTotal();

        request.setAttribute("saldos", saldos);
        request.setAttribute("saldoTotal", saldoTotal);

        RequestDispatcher rd = request.getRequestDispatcher("/listaSaldos.jsp");
        rd.forward(request, response);
    }
}





