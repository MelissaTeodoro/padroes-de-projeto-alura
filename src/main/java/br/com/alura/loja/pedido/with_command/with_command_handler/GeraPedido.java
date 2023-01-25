package br.com.alura.loja.pedido.with_command.with_command_handler;

import java.math.BigDecimal;

public class GeraPedido {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int qtdItens;

    public GeraPedido(String cliente, BigDecimal valorOrcamento, int qtdItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.qtdItens = qtdItens;
    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQtdItens() {
        return qtdItens;
    }
}
