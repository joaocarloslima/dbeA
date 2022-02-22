package loja.testes;

import java.math.BigDecimal;

import loja.Pedido;
import loja.imposto.CalculadoraDeImposto;
import loja.imposto.Icms;
import loja.imposto.Iss;

public class TestaImposto {
	
	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(new BigDecimal(100),1);
		CalculadoraDeImposto calculadoraDeImposto = new CalculadoraDeImposto();
		calculadoraDeImposto.setImposto(new Icms());
		
		BigDecimal imposto = calculadoraDeImposto.calcular(pedido);
		
		System.out.println(imposto);
		
	}

}
