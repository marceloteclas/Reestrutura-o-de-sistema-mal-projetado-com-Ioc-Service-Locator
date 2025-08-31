package com.versao_refatorada;

import java.util.List;

public interface GeradorResumo {
    ResumoLoja gerarResumo(List<Produto> produtos, double totalVendas);
}
