package br.com.alura.loja.orcamento.with_state.situacao;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.orcamento.with_state.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {


    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento) {
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser reprovado");
    }

    public void finalizar(Orcamento orcamento) {
        throw new DomainException("Orçamento não pode ser finalizado");
    }
}
