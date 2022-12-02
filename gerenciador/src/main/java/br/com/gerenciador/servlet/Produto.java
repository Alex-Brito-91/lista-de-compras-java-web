package br.com.gerenciador.servlet;
public class Produto {
	
	private Integer id;
	private String nome;
	private double valorUnitario;
	private Integer quantidade;
	private double valorTotal;
	private double TotalDaCompra;
	
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
	public double getValor() {
		return valorUnitario;
	}
	public void setValor(double valor) {
		this.valorUnitario = valor;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public double getValorTotal() {
		return valorTotal;
	}
	
	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void setTotalDaCompra(double totalDaCompra) {
		TotalDaCompra = totalDaCompra;
	}
	
	public double getTotalDaCompra() {
		return TotalDaCompra;
	}
	
}
