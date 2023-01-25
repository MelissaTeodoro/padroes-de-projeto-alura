package br.com.alura.loja.desconto.com_chain_of_responsibility;

import br.com.alura.loja.orcamento.without_state.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);
        CalculadoraDeDescontos calculadoraDeDescontos = new CalculadoraDeDescontos();

        System.out.println(calculadoraDeDescontos.calcular(orcamento1));
        System.out.println(calculadoraDeDescontos.calcular(orcamento2));
    }
}