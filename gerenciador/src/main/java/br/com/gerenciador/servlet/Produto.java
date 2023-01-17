package br.com.gerenciador.servlet;

import java.math.BigDecimal;
import java.text.DecimalFormat;

public class Produto {

	private Integer id;
	private String nome;
	private BigDecimal valorUnitario;
	private Integer quantidade;
	private BigDecimal valorTotal;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public BigDecimal getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(BigDecimal valor) {
		this.valorUnitario = valor;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(BigDecimal valor) {
		this.valorTotal = valor;
	}
	
	public String getValorUnString() {
		String valorUn = DecimalFormat.getCurrencyInstance().format(this.valorUnitario);
		return valorUn;
	}
	
	public String getValorTotalString() {
		String valorTotalString = DecimalFormat.getCurrencyInstance().format(this.valorTotal);
		return valorTotalString;
	}

}
