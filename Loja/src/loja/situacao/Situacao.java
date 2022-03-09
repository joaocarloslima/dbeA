package loja.situacao;

public abstract class Situacao {

	public abstract void abrirChamado();

	public void pagar(Pedido pedido) {
		throw new SituacaoException("N�o pode mudar para a situa��o Pago");
	}

	public void entregar(Pedido pedido) {
		throw new SituacaoException("N�o pode mudar para a situa��o Entregue");
	}

	public void cancelar(Pedido pedido) {
		throw new SituacaoException("N�o pode mudar para a situa��o Cancelado");
	}

	public void reabrir(Pedido pedido) {
		throw new SituacaoException("N�o pode mudar para a situa��o Entregue");
	}

}
