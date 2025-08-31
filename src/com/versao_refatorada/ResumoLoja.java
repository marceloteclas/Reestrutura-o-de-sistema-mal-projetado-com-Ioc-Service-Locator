package com.versao_refatorada;

import java.util.List;

public class ResumoLoja {
    private final List<Produto> produtos;
    private final double totalVendas;

    public ResumoLoja(List<Produto> produtos, double totalVendas) {
        this.produtos = produtos;
        this.totalVendas = totalVendas;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public double getTotalVendas() {
        return totalVendas;
    }
}
