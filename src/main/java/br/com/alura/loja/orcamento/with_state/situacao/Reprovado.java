package br.com.alura.loja.orcamento.with_state.situacao;

import br.com.alura.loja.orcamento.with_state.Orcamento;

public class Reprovado extends SituacaoOrcamento {

    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
