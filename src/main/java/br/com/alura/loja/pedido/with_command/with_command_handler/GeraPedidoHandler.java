package br.com.alura.loja.pedido.with_command.with_command_handler;

import br.com.alura.loja.orcamento.with_state.Orcamento;
import br.com.alura.loja.pedido.Pedido;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //construtor com injeção de dependências: repository, service, etc.

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no Banco");
        System.out.println("Enviar email com dados do novo pedido");
    }
}
