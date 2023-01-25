package br.com.alura.loja.pedido.with_command.with_command_handler;

import br.com.alura.loja.orcamento.with_state.Orcamento;
import br.com.alura.loja.pedido.Pedido;
import br.com.alura.loja.pedido.acao.EnviarEmailPedido;
import br.com.alura.loja.pedido.acao.SalvarPedidoNoBancoDeDados;

import java.time.LocalDateTime;

public class GeraPedidoHandler {

    //construtor com injeção de dependências: repository, service, etc.

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        EnviarEmailPedido enviarEmail = new EnviarEmailPedido();
        SalvarPedidoNoBancoDeDados salvar = new SalvarPedidoNoBancoDeDados();

        enviarEmail.executar(pedido);
        salvar.executar(pedido);
    }
}
