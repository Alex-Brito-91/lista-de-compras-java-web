package br.com.gerenciador.servlet;
import java.util.Date;
public class Produto {
	
	private Integer id;
	private String nome;
	private double valor;
	private Integer quantidade;
	private Date dataLista = new Date();
	
	
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
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public Integer getQuantidade() {
		return quantidade;
	}
	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}
	
	public Date getDataLista() {
		return dataLista;
	}
	
	public void setDataLista(Date dataLista) {
		this.dataLista = dataLista;
	}
	
}
