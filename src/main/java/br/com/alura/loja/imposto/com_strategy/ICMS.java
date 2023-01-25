package br.com.alura.loja.imposto.com_strategy;

import br.com.alura.loja.orcamento.without_state.Orcamento;

import java.math.BigDecimal;

public class ICMS implements Imposto {

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }
}
