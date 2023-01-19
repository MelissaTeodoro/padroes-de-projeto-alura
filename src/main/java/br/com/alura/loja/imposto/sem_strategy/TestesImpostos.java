package br.com.alura.loja.imposto.sem_strategy;

import br.com.alura.loja.imposto.sem_strategy.CalculadoraDeImpostos;
import br.com.alura.loja.imposto.sem_strategy.TipoImposto;
import br.com.alura.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 3);
        CalculadoraDeImpostos calculadoraDeImpostos = new CalculadoraDeImpostos();

        System.out.println(calculadoraDeImpostos.calcular(orcamento, TipoImposto.ISS));

    }
}