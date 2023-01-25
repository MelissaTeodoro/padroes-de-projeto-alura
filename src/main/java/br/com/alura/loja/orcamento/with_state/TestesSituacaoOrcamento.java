package br.com.alura.loja.orcamento.with_state;

import br.com.alura.loja.exception.DomainException;
import br.com.alura.loja.orcamento.with_state.situacao.Aprovado;
import br.com.alura.loja.orcamento.with_state.situacao.Reprovado;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

public class TestesSituacaoOrcamento {

    @Test
    public static void main(String[] args) {
        Orcamento orcamento1 = new Orcamento(new BigDecimal("200"), 6);
        Orcamento orcamento2 = new Orcamento(new BigDecimal("1000"), 1);

        orcamento1.aprovar();
        Assertions.assertEquals(Aprovado.class, orcamento1.getSituacao().getClass());

        orcamento2.reprovar();
        Assertions.assertEquals(Reprovado.class, orcamento2.getSituacao().getClass());
        Assertions.assertThrows(DomainException.class, orcamento2::aprovar);

        orcamento1.aplicarDescontoExtra();
        Assertions.assertEquals("196.00", orcamento1.getValor().toString());

        orcamento2.aplicarDescontoExtra();
        Assertions.assertEquals("1000", orcamento2.getValor().toString());
    }
}