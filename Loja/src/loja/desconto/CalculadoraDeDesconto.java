package loja.desconto;

import java.math.BigDecimal;

import loja.situacao.Pedido;

public class CalculadoraDeDesconto {

	public BigDecimal calcular(Pedido pedido) {
		
		Desconto desconto = 
				new DescontoPorValor(new DescontoPorQuantidade(new SemDesconto()));
		
		return desconto.calcular(pedido);
		
	}
	
}
