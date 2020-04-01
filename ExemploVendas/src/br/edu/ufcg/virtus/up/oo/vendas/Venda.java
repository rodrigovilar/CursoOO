package br.edu.ufcg.virtus.up.oo.vendas;

import java.util.ArrayList;
import java.util.List;

public class Venda {

	private String data;
	private String cliente;
	private double lGuedes; // Imposto na venda e não do produto
	private List<ItemVenda> itens = new ArrayList<>();
	private double subTotal;
	
	public double getlGuedes() {
		return lGuedes;
	}

	public void setlGuedes(double lGuedes) {
		this.lGuedes = lGuedes;
	}

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
	
	public double subTotalVenda() {
		subTotal = 0.0;
		for (ItemVenda item : itens) {
			double itemSubTotal = item.subTotal();
			subTotal += itemSubTotal;
		}
		calculateLGuedes(subTotal);
		return subTotal;
	}

	private void calculateLGuedes(double valorTotal) {
		if(valorTotal > 0 && valorTotal <= 1000.00) lGuedes = 0;
		else if(valorTotal > 1000.00 && valorTotal <= 10000.00) lGuedes = 0.1;
		else if(valorTotal > 10000.00 && valorTotal <= 20000.00) lGuedes = 0.12;
		else if(valorTotal > 20000.00 && valorTotal <= 100000.00) lGuedes = 0.2;
		else lGuedes = 0.2;
	}
	
	
}
