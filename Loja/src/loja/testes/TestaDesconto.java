package loja.testes;

import java.math.BigDecimal;

import loja.Pedido;
import loja.desconto.CalculadoraDeDesconto;

public class TestaDesconto {
	
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(new BigDecimal(100), 20);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		System.out.println(desconto);
		
	}

}
