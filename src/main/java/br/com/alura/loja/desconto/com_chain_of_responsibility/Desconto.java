package br.com.alura.loja.desconto.com_chain_of_responsibility;

import br.com.alura.loja.orcamento.without_state.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    /**
     * Template method pattern
     */
    public BigDecimal calcular(Orcamento orcamento) {
        if (deveAplicar(orcamento)) {
            return efetuarCalculo(orcamento);
        }

        return this.proximo.calcular(orcamento);
    }

    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);

    protected abstract Boolean deveAplicar(Orcamento orcamento);
}
