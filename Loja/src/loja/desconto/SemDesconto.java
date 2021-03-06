package loja.desconto;

import java.math.BigDecimal;

import loja.situacao.Pedido;

public class SemDesconto extends Desconto {

	public SemDesconto() {
		super(null);
	}

	@Override
	protected BigDecimal calcularDesconto(Pedido pedido) {
		return BigDecimal.ZERO;
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return true;
	}

}
