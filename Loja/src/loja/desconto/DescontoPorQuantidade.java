package loja.desconto;

import java.math.BigDecimal;

import loja.situacao.Pedido;

public class DescontoPorQuantidade extends Desconto {

	public DescontoPorQuantidade(Desconto proximo) {
		super(proximo);
	}

	@Override
	protected BigDecimal calcularDesconto(Pedido pedido) {
		return pedido.getValor().multiply(new BigDecimal(0.03));
	}

	@Override
	protected boolean deveAplicar(Pedido pedido) {
		return pedido.getTotalDeItens() > 10;
	}

}
