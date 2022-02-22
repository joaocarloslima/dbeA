package loja.desconto;

import java.math.BigDecimal;

import loja.Pedido;

public abstract class Desconto {
	
	protected Desconto proximo;
	
	public Desconto(Desconto proximo) {
		this.proximo = proximo;
	}
	
	public final BigDecimal calcular(Pedido pedido) {
		if ( deveAplicar(pedido) ) {
			return calcularDesconto(pedido);
		}
		
		return proximo.calcular(pedido);
	}
	
	protected abstract BigDecimal calcularDesconto(Pedido pedido);
	protected abstract boolean deveAplicar(Pedido pedido);

	public Desconto getProximo() {
		return proximo;
	}

}
