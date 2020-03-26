package br.edu.ufcg.virtus.up.oo.vendas;

public class ItemVenda {

	private Venda venda;
	private Produto produto;
	private double quantidade;

	
	public Venda getVenda() {
		return venda;
	}

	public void setVenda(Venda venda) {
		this.venda = venda;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public double getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(double quantidade) {
		this.quantidade = quantidade;
	}

	public double subTotal() {
		return this.getProduto().getPrecoComIPI() * this.getQuantidade();		
	}

}
