package br.com.alura.loja.pedido.observer;

import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;
import br.com.alura.loja.pedido.with_command.with_command_handler.GeraPedido;

import java.math.BigDecimal;
import java.util.Arrays;

public class TestesPedidos {

    public static void main(String[] args) {
        String cliente ="Maria";

        BigDecimal valorOrcamento = new BigDecimal("300");
        int qtdItens = 2;

        GeraPedido gerador = new GeraPedido(cliente, valorOrcamento, qtdItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(
                        new SalvarPedidoNoBancoDeDados(),
                        new EnviarEmailPedido())
        );

        handler.executa(gerador);
    }
}
