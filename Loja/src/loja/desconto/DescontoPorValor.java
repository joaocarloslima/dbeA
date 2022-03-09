package loja.desconto;

import java.math.BigDecimal;

import loja.situacao.Pedido;

public class DescontoPorValor extends Desconto {

	public DescontoPorValor(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal calcularDesconto(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal(0.05));
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return pedido.getValor().compareTo(new BigDecimal(500)) > 0;
	}

}
