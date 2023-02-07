package br.com.gerenciador.servlet;

import java.math.BigDecimal;

public class Saldo {

	private BigDecimal alimentação1;
	private BigDecimal alimentacao2;
	private BigDecimal dinheiro;

	public BigDecimal getAlimentação1() {
		return alimentação1;
	}

	public void setAlimentação1(BigDecimal alimentação1) {
		this.alimentação1 = alimentação1;
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
