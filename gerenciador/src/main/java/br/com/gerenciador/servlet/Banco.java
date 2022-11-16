package br.com.gerenciador.servlet;

import java.util.ArrayList;
import java.util.List;

public class Banco {
	
	private static List<Produto> produtos = new ArrayList<>();

	public void adiciona(Produto produto) {
		Banco.produtos.add(produto);
	}
	
	public List<Produto> getProdutos() {
		return Banco.produtos;
	}
	
	

}
