package br.edu.ufcg.virtus.up.oo.vendas;

public class VendaBuilder {

	private Venda venda;
	
	public VendaBuilder() {
		venda = new Venda();
	}

	public static VendaBuilder venda() {
		return new VendaBuilder();
	}
	
	public VendaBuilder cliente(String cliente) {
		venda.setCliente(cliente);
		return this;
	}
	
	public VendaBuilder data(String data) {
		venda.setData(data);
		return this;
	}

	public VendaBuilder addItem(Produto produto, double quantidadeItem) {
		ItemVenda itemVenda = new ItemVenda();
		itemVenda.setQuantidade(quantidadeItem);
		itemVenda.setProduto(produto);
		
		venda.addItem(itemVenda);
		
		return this;
	}
	
	public Venda build() {
		return venda;
	}
	
}
