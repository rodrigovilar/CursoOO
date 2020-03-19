package br.edu.ufcg.virtus.up.oo.vendas;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private String data;
	private String cliente;
	
	private List<ItemVenda> itens = new ArrayList<>();

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public List<ItemVenda> getItens() {
		return itens;
	}

	public void addItem(ItemVenda itemVenda) {
		itens.add(itemVenda);
	}
}
