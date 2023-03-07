package br.com.gerenciador.servlet;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Banco {
	
	private static List<Produto> produtos = new ArrayList<>();
	private static List<Saldo> saldo = new ArrayList<>();
	
	private static Integer chaveSequencial = 1;
	
	public void adiciona(Produto produto) {
		produto.setId(Banco.chaveSequencial++);
		Banco.produtos.add(produto);
	}
	
	public List<Produto> getProdutos() {
		return Banco.produtos;
	}

	public void removeProduto(Integer id) {
		
		Iterator<Produto> it = produtos.iterator();
		
		while (it.hasNext()) {
			Produto p = it.next();
			
			if (p.getId() == id) {
				it.remove();
			}
		}
	}

	public Produto buscaIdProduto(Integer id) {
		for (Produto produto : produtos) {
			if(produto.getId() == id) {
				return produto;
			}
		} return null;
		
	}
	
	public String totalCompra() {
		BigDecimal totalDaCompra = new BigDecimal(0);
		for (Produto produto : produtos) {
			totalDaCompra = totalDaCompra.add(produto.getValorTotal());
		}
		String totalFormatado = DecimalFormat.getCurrencyInstance().format(totalDaCompra);
		return totalFormatado;
	}
	
	public void adicionaSaldo(Saldo saldo) {
		Banco.saldo.add(saldo);
	}
	
	public List<Saldo> getSaldo() {
		return Banco.saldo;
	}
	
	public String saldoTotal(List<Saldo> saldos) {
		BigDecimal saldoTotal = BigDecimal.ZERO;
		for (Saldo saldo : saldos) {
			saldoTotal = saldoTotal.add(saldo.getAlimentação1().add(saldo.getAlimentacao2().add(saldo.getDinheiro())));
		}
		String totalFormatado = DecimalFormat.getCurrencyInstance().format(saldoTotal);
		return totalFormatado;
	}
	
}
