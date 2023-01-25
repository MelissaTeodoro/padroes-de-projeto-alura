package br.com.alura.loja.pedido.without_command;

import br.com.alura.loja.orcamento.with_state.Orcamento;
import br.com.alura.loja.pedido.Pedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class TestesPedidos {

    public static void main(String[] args) {

        /**
         * "Se precisássemos, além de executar a geração
         * de pedido através da CLI, também executar através de um formulário web,
         * uma API e/ou mensagens de uma fila, precisaríamos duplicar
         * este código em vários lugares.
         */

        Orcamento orcamento = new Orcamento(new BigDecimal("600"), 4);
        Pedido pedido = new Pedido("Ana Luiza", LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no Banco");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
