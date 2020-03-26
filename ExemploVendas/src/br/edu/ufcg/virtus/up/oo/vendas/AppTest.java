package br.edu.ufcg.virtus.up.oo.vendas;

import static org.junit.jupiter.api.Assertions.*;


import static br.edu.ufcg.virtus.up.oo.vendas.VendaBuilder.venda;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class AppTest {
	
	private Produto s10 = new Produto();
	private Produto iPhoneXR = new Produto();


	@BeforeEach
	public void setupInicial() {
		s10.setNome("S10");
		s10.setPreco(5000.0);		
		iPhoneXR.setNome("iPhone XR");
		iPhoneXR.setPreco(10000.0);
	}
	
	
	@Test
	void vendaSimples() {
		Venda venda = venda().cliente("Jose").data("19/03/2020")
				.addItem(s10, 1.0)
				.addItem(iPhoneXR, 2.0).build();
		
		String resultado = App.vender(venda);
		
		assertEquals("Venda realizada em 19/03/2020 para Jose\r\n" + 
				"Detalhes da venda:\r\n" + 
				"1 S10 ( 5000.0) x 1.0 = 5000.0\r\n" + 
				"2 iPhone XR ( 10000.0) x 2.0 = 20000.0\r\n" + 
				"Valor total: 25000.0\r\n", resultado);
	}
	
	@Test
	void duasVendas() {
		Venda venda1 = venda().cliente("Jose").data("19/03/2020").addItem(s10, 1.0).addItem(iPhoneXR, 2.0).build();

		Venda venda2 = venda().cliente("Joao").data("23/03/2020").addItem(s10, 2.0).build();
		
		String resultado1 = App.vender(venda1);
		String resultado2 = App.vender(venda2);

		assertEquals("Venda realizada em 19/03/2020 para Jose\r\n" + 
				"Detalhes da venda:\r\n" + 
				"1 S10 ( 5000.0) x 1.0 = 5000.0\r\n" + 
				"2 iPhone XR ( 10000.0) x 2.0 = 20000.0\r\n" + 
				"Valor total: 25000.0\r\n", resultado1);
		
		assertEquals("Venda realizada em 23/03/2020 para Joao\r\n" + 
				"Detalhes da venda:\r\n" + 
				"1 S10 ( 5000.0) x 2.0 = 10000.0\r\n" + 
				"Valor total: 10000.0\r\n", resultado2);
	}
	
}


// Red Green Refactor