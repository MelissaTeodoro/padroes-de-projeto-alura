package br.com.alura.loja.desconto.com_chain_of_responsibility;

import br.com.alura.loja.orcamento.without_state.Orcamento;

import java.math.BigDecimal;

public class SemDesconto extends Desconto {

    public SemDesconto() {
        super(null);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return true;
    }
}
