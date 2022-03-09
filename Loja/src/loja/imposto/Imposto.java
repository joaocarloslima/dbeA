package loja.imposto;

import java.math.BigDecimal;

import loja.situacao.Pedido;

public interface Imposto {
	
	BigDecimal calcular(Pedido pedido);

}
