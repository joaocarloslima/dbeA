package loja.situacao;

public class LogListener implements SituacaoListener {

	@Override
	public void update(Pedido pedido) {
		System.err.println("LOG do pedido");	
	}

}
