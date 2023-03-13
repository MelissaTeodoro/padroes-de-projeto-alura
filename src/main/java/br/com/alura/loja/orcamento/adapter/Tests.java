package br.com.alura.loja.orcamento.adapter;

import br.com.alura.loja.orcamento.adapter.http.JavaHttpClient;
import br.com.alura.loja.orcamento.with_state.Orcamento;

import java.math.BigDecimal;

public class Tests {

    public static void main(String[] args) {
        //Exemplo...
        final Orcamento orcamento = new Orcamento(BigDecimal.TEN, 1);
        orcamento.aprovar();
        orcamento.finalizar();

        final RegistroDeOrcamento registroDeOrcamento = new RegistroDeOrcamento(new JavaHttpClient());
        registroDeOrcamento.registrar(orcamento);
    }
}
