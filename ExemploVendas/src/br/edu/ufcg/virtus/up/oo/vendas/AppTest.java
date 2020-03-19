package br.edu.ufcg.virtus.up.oo.vendas;

import static org.junit.jupiter.api.Assertions.*;

import static br.edu.ufcg.virtus.up.oo.vendas.VendaBuilder.venda;

import org.junit.jupiter.api.Test;

class AppTest {

	@Test
	void vendaSimples() {
		Venda venda = venda().cliente("Jose").data("19/03/2020").addItem("S10", 5000.0, 1.0).addItem("iPhone XR", 10000.0, 2.0).build();
		
		String resultado = App.vender(venda);
		
		assertEquals("Venda realizada em 19/03/2020 para Jose\r\n" + 
				"Detalhes da venda:\r\n" + 
				"1 S10 ( 5000.0) x 1.0 = 5000.0\r\n" + 
				"2 iPhone XR ( 10000.0) x 2.0 = 20000.0\r\n" + 
				"Valor total: 25000.0\r\n", resultado);
	}
}


// Red Green Refactor