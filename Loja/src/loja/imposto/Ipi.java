package loja.imposto;

import java.math.BigDecimal;

import loja.Pedido;

public class Ipi implements Imposto{

	@Override
	public BigDecimal calcular(Pedido pedido) {
		return BigDecimal.ONE;
	}

}
