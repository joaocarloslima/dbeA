package loja.testes;

import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.math.RoundingMode;

import org.junit.jupiter.api.Test;

import loja.Pedido;
import loja.desconto.CalculadoraDeDesconto;

class DescontoTest {

	@Test
	void deveRetornarDescontoParaPedidosCaros() {
		Pedido pedido = new Pedido(new BigDecimal(600), 20);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(new BigDecimal("30.00"), desconto.setScale(2, RoundingMode.UP));
	}
	
	@Test
	void deveRetornarDescontoParaPedidosGrandes() {
		Pedido pedido = new Pedido(new BigDecimal(100), 20);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(new BigDecimal("3.00"), desconto.setScale(2, RoundingMode.UP));
	}
	
	@Test
	void deveRetornarDescontoZeroSeChegarNoFinalDaCadeiaDeDesconto() {
		Pedido pedido = new Pedido(new BigDecimal(100), 10);
		CalculadoraDeDesconto calculadoraDeDesconto = new CalculadoraDeDesconto();
		BigDecimal desconto = calculadoraDeDesconto.calcular(pedido);
		
		assertEquals(BigDecimal.ZERO, desconto);
	}
	

}
