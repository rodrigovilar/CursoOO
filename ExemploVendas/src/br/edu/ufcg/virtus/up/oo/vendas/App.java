package br.edu.ufcg.virtus.up.oo.vendas;

public class App {

	static String[] nomesProdutos = { "iPhone XR", "S10" };
	static double[] precoProdutos = { 10000.00, 5000.00 };
	
	static String cliente = "Jose";
	static String data = "19/03/2020";
	
	static int[] produtoItens = { 1, 0 };
	static double[] quantidadeItens = { 1.00, 2.00 };

	public static void main(String[] args) {
		
		double valorTotal = 0.0;
		
		System.out.println("Venda realizada em " + data + " para " + cliente);
		System.out.println("Detalhes da venda:");
		
		for (int indiceItem = 0; indiceItem < produtoItens.length; indiceItem++) {
			
			double quantidadeProduto = quantidadeItens[indiceItem];
			int indiceProduto = produtoItens[indiceItem];
			
			String nomeProduto = nomesProdutos[indiceProduto];
			double precoProduto = precoProdutos[indiceProduto];
			
			double subTotal = precoProduto*quantidadeProduto;
			System.out.println(indiceItem + " " + nomeProduto + " ( " + precoProduto + ") x " + quantidadeProduto + " = " + subTotal);
			
			valorTotal += subTotal;
		}
		
		System.out.println("Valor total: " + valorTotal);
	}
}
