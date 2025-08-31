package com.reestruturacao_ioc_sl;

import java.util.List;

public interface GeradorResumo {
    ResumoLoja gerarResumo(List<Produto> produtos, double totalVendas);
}
