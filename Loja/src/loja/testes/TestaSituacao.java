package loja.testes;

import java.math.BigDecimal;

import loja.situacao.EmailListener;
import loja.situacao.LogListener;
import loja.situacao.Pedido;

public class TestaSituacao {
	
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(new BigDecimal(100), 1);
		pedido.getManager().subscribe(new EmailListener());
		pedido.getManager().subscribe(new LogListener());
		
		pedido.abrirChamado();
		
		pedido.cancelar();
		pedido.reabrir();
		
		pedido.pagar();
		pedido.abrirChamado();
		
		pedido.entregar();
		pedido.abrirChamado();
		
		//pedido.setSituacao(new Aberto());
		
		//pedido.reabrir();
		
	}

}
