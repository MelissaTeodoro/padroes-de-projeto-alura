package br.com.alura.loja.orcamento.adapter;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.orcamento.adapter.http.HttpAdapter;
import br.com.alura.loja.orcamento.with_state.Orcamento;

import java.util.Map;

public class RegistroDeOrcamento {

    /**
     * Existem várias implementações para fazer a chamada HTTP (URL Connection, Http Client, lib Rest...),
     * porém se implementarmos nessa classe, acaba misturando o registro do orçamento com detalhe de infraestrutura.
     * Caso quisermos mudar a implementação da chamada http, vamos precisar mexer em um código
     * que tem implementada a regra de registro, então como solução podemos usar o adapter e implementar o que precisamos
     * de forma mais elegante, assim criamos uma abstração para deixar o código mais flexivel.
     */

    private HttpAdapter httpAdapter;

    public RegistroDeOrcamento(HttpAdapter httpAdapter) {
        this.httpAdapter = httpAdapter;
    }

    public void registrar(Orcamento orcamento) {
        if(!orcamento.isFinalizado()) {
            throw new DomainException("Orçamento não finalizado");
        }
        final String url = "http://api.externa/orcamento";
        final Map<String, Object> dados = Map.of(
                "valor", orcamento.getValor(),
                "quantidadeItens", orcamento.getQtdItens()
        );

        this.httpAdapter.post(url, dados);
    }
}
