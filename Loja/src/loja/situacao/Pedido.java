package loja.situacao;

import java.math.BigDecimal;

public class Pedido {
	
	private BigDecimal valor;
	private int totalDeItens;
	private Situacao situacao = new Aberto();
	private EventManager manager = new EventManager();
	
	public Pedido(BigDecimal valor, int totalDeItens) {
		super();
		this.valor = valor;
		this.totalDeItens = totalDeItens;
	}
	
	public void abrirChamado() {
		situacao.abrirChamado();
	}

	public void pagar() {
		situacao.pagar(this);
	}

	public void entregar() {
		situacao.entregar(this);
	}

	public void cancelar() {
		situacao.cancelar(this);
	}

	public void reabrir() {
		situacao.reabrir(this);
	}

	public BigDecimal getValor() {
		return valor;
	}
	
	public int getTotalDeItens() {
		return totalDeItens;
	}

	public Situacao getSituacao() {
		return situacao;
	}

	protected void setSituacao(Situacao situacao) {
		getManager().notifyListeners(this);
		this.situacao = situacao;
	}

	public EventManager getManager() {
		return manager;
	}

}
