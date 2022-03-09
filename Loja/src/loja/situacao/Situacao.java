package loja.situacao;

public abstract class Situacao {

	public abstract void abrirChamado();

	public void pagar(Pedido pedido) {
		throw new SituacaoException("Não pode mudar para a situação Pago");
	}

	public void entregar(Pedido pedido) {
		throw new SituacaoException("Não pode mudar para a situação Entregue");
	}

	public void cancelar(Pedido pedido) {
		throw new SituacaoException("Não pode mudar para a situação Cancelado");
	}

	public void reabrir(Pedido pedido) {
		throw new SituacaoException("Não pode mudar para a situação Entregue");
	}

}
