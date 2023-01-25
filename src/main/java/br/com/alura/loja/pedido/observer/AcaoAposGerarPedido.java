package br.com.alura.loja.pedido.observer;

import br.com.alura.loja.pedido.Pedido;

public interface AcaoAposGerarPedido {

    void executar(Pedido pedido);
}
