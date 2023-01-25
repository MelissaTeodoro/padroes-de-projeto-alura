package br.com.alura.loja.orcamento.with_state;

import br.com.alura.loja.orcamento.with_state.situacao.EmAnalise;
import br.com.alura.loja.orcamento.with_state.situacao.SituacaoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int qtdItens;

    private SituacaoOrcamento situacao;

    public Orcamento(BigDecimal valor, int qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
        this.situacao = new EmAnalise();
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public SituacaoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacaoOrcamento situacao) {
        this.situacao = situacao;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDesconto = this.situacao.calcularValorDescontoExtra(this);

        this.valor = this.valor.subtract(valorDoDesconto);
    }

    public void aprovar() {
        this.situacao.aprovar(this);
    }

    public void reprovar() {
        this.situacao.reprovar(this);
    }

    public void finalizar() {
        this.situacao.finalizar(this);
    }
}