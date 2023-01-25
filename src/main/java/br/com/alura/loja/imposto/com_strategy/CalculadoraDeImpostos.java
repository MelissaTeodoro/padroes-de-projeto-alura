package br.com.alura.loja.imposto.com_strategy;

import br.com.alura.loja.orcamento.without_state.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {
    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }
}
