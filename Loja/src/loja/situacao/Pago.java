package loja.situacao;

public class Pago extends Situacao {

	@Override
	public void abrirChamado() {
		System.out.println("Abrir chamado para o departamento de LOGISTICA");
	}

	@Override
	public void entregar(Pedido pedido) {
		pedido.setSituacao(new Entregue());
	}


}
