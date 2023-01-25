package br.com.alura.loja.pedido.acao;

import br.com.alura.loja.pedido.Pedido;
import br.com.alura.loja.pedido.observer.AcaoAposGerarPedido;

public class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executar(Pedido pedido) {
        System.out.println("Enviando email com dados do pedido...");

    }
}
