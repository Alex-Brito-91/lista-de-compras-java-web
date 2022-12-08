package br.com.gerenciador.servlet;

import java.math.BigDecimal;

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

}
