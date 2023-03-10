package br.com.gerenciador.servlet;

import java.math.BigDecimal;

public class Saldo {

	private Integer id;
	private BigDecimal alimentacao1;
	private BigDecimal alimentacao2;
	private BigDecimal dinheiro;

	public Integer getId() {
		return id;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public BigDecimal getAlimentacao1() {
		return alimentacao1;
	}

	public void setAlimentacao1(BigDecimal alimentacao1) {
		this.alimentacao1 = alimentacao1;
	}

	public BigDecimal getAlimentacao2() {
		return alimentacao2;
	}

	public void setAlimentacao2(BigDecimal alimentacao2) {
		this.alimentacao2 = alimentacao2;
	}

	public BigDecimal getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(BigDecimal dinheiro) {
		this.dinheiro = dinheiro;
	}
	
}
