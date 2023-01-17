package br.com.gerenciador.servlet;

import java.math.BigDecimal;

public class Saldo {
	
	private BigDecimal dinheiro;
	private BigDecimal alimentação;
	private BigDecimal refeicao;
	
	
	public BigDecimal getDinheiro() {
		return dinheiro;
	}
	public void setDinheiro(BigDecimal dinheiro) {
		this.dinheiro = dinheiro;
	}
	public BigDecimal getAlimentação() {
		return alimentação;
	}
	public void setAlimentação(BigDecimal alimentação) {
		this.alimentação = alimentação;
	}
	public BigDecimal getRefeicao() {
		return refeicao;
	}
	public void setRefeicao(BigDecimal refeicao) {
		this.refeicao = refeicao;
	}
	
}
