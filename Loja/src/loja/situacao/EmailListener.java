package loja.situacao;

public class EmailListener implements SituacaoListener {

	@Override
	public void update(Pedido pedido) {
		System.out.println("Email para o pedido " + pedido);
	}

}
