package br.com.alura.loja.desconto.com_chain_of_responsibility;

import br.com.alura.loja.orcamento.without_state.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {

    public BigDecimal calcular(Orcamento orcamento) {
        Desconto cadeiaDeDescontos = new DescontoParaOrcamentoComMaisDeCincoItens(
                new DescontoParaOrcamentoComValorMaiorQueQuinhentos(
                        new SemDesconto()
                )
        );

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
