package br.com.alura.loja.orcamento.without_state;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int qtdItens;

    private String situacao;

    public Orcamento(BigDecimal valor, int qtdItens) {
        this.valor = valor;
        this.qtdItens = qtdItens;
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQtdItens() {
        return qtdItens;
    }

    public String getSituacao() {
        return situacao;
    }

    public void aplicarDescontoExtra() {
        BigDecimal valorDoDesconto = BigDecimal.ZERO;

        if ("EM ANALISE".equalsIgnoreCase(situacao)) {
            valorDoDesconto = new BigDecimal("0.05");
        } else if ("APROVADO".equalsIgnoreCase(situacao)) {
            valorDoDesconto = new BigDecimal("0.02");
        }
        this.valor = this.valor.subtract(valorDoDesconto);
    }

    public void aprovar() {
        this.situacao = "APROVADO";
    }
}