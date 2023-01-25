package br.com.alura.loja.imposto.com_strategy;

import br.com.alura.loja.orcamento.without_state.Orcamento;

import java.math.BigDecimal;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);
}
