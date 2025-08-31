package com.reestruturacao_ioc_sl;

import java.util.List;

public class GeradorResumoLoja implements GeradorResumo {
    @Override
    public ResumoLoja gerarResumo(List<Produto> produtos, double totalVendas) {
        return new ResumoLoja(produtos, totalVendas);
    }
}
