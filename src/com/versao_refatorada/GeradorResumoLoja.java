package com.versao_refatorada;

import java.util.List;

public class GeradorResumoLoja implements GeradorResumo {
    @Override
    public ResumoLoja gerarResumo(List<Produto> produtos, double totalVendas) {
        return new ResumoLoja(produtos, totalVendas);
    }
}
