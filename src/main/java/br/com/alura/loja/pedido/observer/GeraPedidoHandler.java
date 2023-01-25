package br.com.alura.loja.pedido.observer;

import br.com.alura.loja.orcamento.with_state.Orcamento;
import br.com.alura.loja.pedido.Pedido;
import br.com.alura.loja.pedido.with_command.with_command_handler.GeraPedido;

import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    /**
     * Ao inves de receber varias dependencias, podemos receber a lista com a interface,
     * usando do polimorfismo
     */
    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    public void executa(GeraPedido dados) {
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(), dados.getQtdItens());
        Pedido pedido = new Pedido(dados.getCliente(), LocalDateTime.now(), orcamento);

        /**
         * Assim o método não vai mais crescer
         */
        acoes.forEach(acao -> acao.executar(pedido));
    }
}
