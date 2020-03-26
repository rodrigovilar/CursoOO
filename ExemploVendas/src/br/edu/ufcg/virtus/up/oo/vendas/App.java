package br.edu.ufcg.virtus.up.oo.vendas;

public class App {

	static String[] nomesProdutos = { "iPhone XR", "S10" };
	static double[] precoProdutos = { 10000.00, 5000.00 };
	static double[] ipiProdutos = { 0.1, 0.05 };
	
	static String cliente = "Jose";
	static String data = "19/03/2020";
	
	static int[] produtoItens = { 1, 0 };
	static double[] quantidadeItens = { 1.00, 2.00 };

	public static void main(String[] args) {
		Venda venda = new Venda();
		venda.setCliente("Jose");
		venda.setData("19/03/2020");
		
		System.out.println(vender(venda));
	}

	public static String vender(Venda venda) {
		StringBuilder result = 
			new StringBuilder()
				.append("Venda realizada em " + venda.getData() + " para " + venda.getCliente() + "\r\n");
		
		double valorTotal = detalhesVender(venda, result);
		return result.append("Valor total: " + valorTotal + "\r\n").toString();
	}
	
	private static double detalhesVender(Venda venda, StringBuilder result) {
		double valorTotal = 0.0;

		result.append("Detalhes da venda:\r\n");

		for (int indiceItem = 0; indiceItem < venda.getItens().size(); indiceItem++) {
			
			ItemVenda itemVenda = venda.getItens().get(indiceItem);
			double subTotal = itemVenda.subTotal();
			result.append( (indiceItem + 1 ) + " " + itemVenda.getProduto().getNome() + 
					" ( " + itemVenda.getProduto().getPreco() + ") x " + itemVenda.getQuantidade() + " = " + subTotal + "\r\n");
			valorTotal += subTotal;
		}
		
		return valorTotal;
	}
}

// Objeto
// - Tipo
// - Dados
// - Comportamento
