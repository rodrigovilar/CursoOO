package br.edu.ufcg.virtus.up.oo.vendas;

public class Produto {

	private String nome;
	private double preco;
	private double aliquotaIPI;

	
	public double getAliquotaIPI() {
		return aliquotaIPI;
	}

	public void setAliquotaIPI(double aliquotaIPI) {
		this.aliquotaIPI = aliquotaIPI;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}
	
	public double getPrecoComIPI() {
		return preco * (this.getAliquotaIPI() + 1) ;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
