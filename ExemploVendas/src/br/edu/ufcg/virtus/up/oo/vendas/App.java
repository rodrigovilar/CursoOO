package br.edu.ufcg.virtus.up.oo.vendas;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class App {

	static String[] nomesProdutos = { "iPhone XR", "S10" };
	static double[] precoProdutos = { 10000.00, 5000.00 };
	static double[] ipiProdutos = { 0.1, 0.05 };
	
	static String cliente = "Jose";
	static String data = "19/03/2020";
	
	static int[] produtoItens = { 1, 0 };
	static double[] quantidadeItens = { 1.00, 2.00 };
	
	public static void main(String[] args) {
		Produto prodIphone = new Produto();
		prodIphone.setAliquotaIPI(ipiProdutos[0]);
		prodIphone.setNome(nomesProdutos[0]);
		prodIphone.setPreco(precoProdutos[0]);
		
		Produto prodS10 = new Produto();
		prodS10.setAliquotaIPI(ipiProdutos[1]);
		prodS10.setNome(nomesProdutos[1]);
		prodS10.setPreco(precoProdutos[1]);
		
		ItemVenda item1 = new ItemVenda();
		item1.setProduto(prodIphone);
		item1.setQuantidade(2);
		
		ItemVenda item2 = new ItemVenda();
		item2.setProduto(prodS10);
		item2.setQuantidade(2);

		
		Venda venda = new Venda(); // Com LGguedes implementado.
		venda.setCliente("Joao");
		venda.setData("23/03/2020");
		venda.addItem(item2);
//		venda.addItem(item1);
		
		System.out.println(vender(venda));
	}

	public static String vender(Venda venda) {
		StringBuilder result = 
			new StringBuilder()
				.append("Venda realizada em " + venda.getData() + " para " + venda.getCliente() + "\r\n");
		
		double valorParcial = venda.statusVenda(result);
		double valorTotal = valorParcial * (1 + venda.getlGuedes());
		result.append("Valor parcial: " + valorParcial + "\r\n");
		return result.append("Valor total: " + valorParcial + " ( 1 + " + venda.getlGuedes() + " )" + " = " + BigDecimal.valueOf(valorTotal).setScale(2, RoundingMode.HALF_UP).doubleValue() + "\r\n").toString();
	}
	

}

// Objeto
// - Tipo
// - Dados
// - Comportamento
